class Template(
    terminals: Collection<Node>,
    nonTerminals: Collection<Node>,
    startNonTerminal: String,
    skipChar: Collection<String>,
    attributes: Collection<String>
) {
    private val tokens = terminals.withIndex().associate { it.value.name to "TOKEN${it.index}" } + Pair("$", "END")

    init {
        println("TOKENS: $tokens")
    }

    private fun escapeRegex(regex: String): String {
        return if (regex.length == 1 && "()[]+*^".contains(regex[0])) {
            "\\\\$regex"
        } else regex
    }

    val parsingException = """
class ParsingException(message: String): RuntimeException(message)
""".trimIndent()

    val source = """
interface Source {
    fun hasNext(): Boolean
    fun next(): Char
    fun getPos(): Int
    fun error(message: String): ParsingException
}
""".trimIndent()

    val stringSource = """
        class StringSource(data: String) : Source {
            private val data: String = "${'$'}data$"
            private var pos: Int = 0

            override fun getPos(): Int {
                return pos
            }

            override fun hasNext(): Boolean {
                return pos < data.length
            }

            override fun next(): Char
                    = data[pos++]


            override fun error(message: String): ParsingException {
                return ParsingException("${'$'}pos: ${'$'}message")
            }
        }
""".trimIndent()

    val lexer = """
enum class Token {
    START, ${tokens.values.joinToString(", ")}
}

class Lexer(val source: Source) {
    var curChar = ' '
    var curToken = Token.START
    var curBuilder = StringBuilder()
    var curString = ""
    
    private val tokenRegex = mapOf(
        ${tokens.map { "Token.${it.value} to Regex(\"${escapeRegex(it.key)}\")" }.joinToString(",\n\t\t")}
    )
    
    private fun isSkippedChar(c: Char): Boolean {
        return c in charArrayOf(${skipChar.joinToString(", ") { "\'" + it + "\'" }})
    }
    
    private fun nextChar() {
        curChar = if (source.hasNext()) source.next() else '$'
    }
    
    fun error(message: String): Exception {
        return source.error(message)
    }
    
    fun nextToken() {
        while (isSkippedChar(curChar)) {
            nextChar()
        }
        
        while (!isSkippedChar(curChar) && curChar != '$') {
            curBuilder.append(curChar)
            nextChar()
        }
        
        val newBuilder = StringBuilder()
        while (curBuilder.isNotEmpty()) {
            val tokens = tokenRegex.filter { curBuilder.matches(it.value) }.keys
            if (tokens.isNotEmpty()) {
                curToken = tokens.first()
                curString = curBuilder.toString()
                curBuilder = newBuilder
                return
            }
            newBuilder.insert(0, curBuilder.last())
            curBuilder.deleteCharAt(curBuilder.lastIndex)
        }
        
        if (curBuilder.isEmpty() && curChar == '${'$'}') {
            curToken = Token.END
        } else {
            error("Unsupported token ${'$'}newBuilder")
        }
    }
}
""".trimIndent()

    val parsingTree = """
import java.io.PrintWriter
import java.io.File
import java.nio.file.Paths

open class ParsingTree(val node: String, val children: MutableList<ParsingTree> = mutableListOf(), val content: String = "") {
    companion object {
        var nodeId = 0
    }
    
    ${attributes.joinToString("\n") { "var $it" }}
    
    private fun dfs(out: PrintWriter, id: Int) {
        for (child in children) {
            nodeId++
            out.println("    ${'$'}id [label=\"${'$'}node\"];")
            out.println("    ${'$'}nodeId [label=\"${'$'}{child.node}\"];")
            out.println("    ${'$'}id -> ${'$'}nodeId")
            child.dfs(out, nodeId)
        }
        out.println()
    }
    
    fun toGV(fileName: String) {
        File(Paths.get("").toAbsolutePath().toString() + "/out/${'$'}fileName.gv").printWriter().use { out ->
            out.println("digraph ParsingTree {")
            dfs(out, 0)
            out.println("}")
        }
    }
}
""".trimIndent()

    val parser = """
class Parser {
    private lateinit var lex: Lexer
    
    fun parse(source: Source): ParsingTree {
        lex = Lexer(source)
        lex.nextToken()
        val res = parse$startNonTerminal {}
        expect(Token.END)
        return res
    }
    
    private fun test(token: Token): Boolean {
        if (lex.curToken == token) {
            lex.nextToken()
            return true
        }
        return false
    }
    
    private fun expect(token: Token) {
        if (!test(token)) {
            throw ParsingException("Expected '${'$'}token', found '${'$'}{lex.curToken}'")
        }
    }

    ${
        nonTerminals.joinToString("") {
            val nonTerminalName = it.name
            """
    private fun parse$nonTerminalName(action: (ParsingTree) -> Unit): ParsingTree {
        val children = mutableListOf<ParsingTree>()
        val res = ParsingTree("$nonTerminalName", children)
        action(res)
        when (lex.curToken) {
            ${
                // case
                it.firstPrime.map { (fold, first) ->
                    var nodeId = 0
                    """
            ${first.joinToString(", ") { pattern -> "Token.${tokens[pattern]}" }} -> {
                    ${
                        if (fold.nodes.isEmpty()) {
                            """
                res.children.add(ParsingTree("\\eps")) 
                            """
                        } else {
                            fold.nodes.joinToString("\n") { foldNode ->
                                val name = foldNode.name
                                nodeId++
                                if (nonTerminals.contains(foldNode)) {
                                    """
                val node${nodeId} = parse${name} ${if (fold.iAttributes != null && fold.iAttributes!!.first == name) fold.iAttributes!!.second else "{}"}
                children.add(node${nodeId})"""
                                } else {
                                    """
                val str${nodeId} = lex.curString
                expect(Token.${tokens[name]})
                children.add(ParsingTree("$name", content=str${nodeId}))"""
                                }
                            }
                        } +
                                if (fold.sAttributes != null) {
                                    """
                run ${fold.sAttributes}"""
                                } else {
                                    ""
                                }
                    }     
            }
"""
                }.joinToString("\n")
                // case
            }
            else -> throw ParsingException("Unexpected token: ${'$'}{lex.curToken}")
        }
        return res
    }
""".deleteEmptyLines()
        }
    }
}
""".trimIndent()
}


fun String.deleteEmptyLines(): String {
    return this.replace("\\n[ \\t\\f]*\\n".toRegex(), "\n").replace("\\n+".toRegex(), "\n")
}