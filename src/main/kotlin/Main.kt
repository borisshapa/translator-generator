import generator.GrammarLexer
import generator.GrammarParser
import generator.GrammarParserListener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File

fun main() {
    generateTranslator("grammars/calculator.txt", "calculator")
    generateTranslator("grammars/func-header.txt", "funcheader")
}

fun generateTranslator(grammarFile: String, dirName: String) {
    val listener = GrammarParserListenerImpl()
    parseGrammar(grammarFile, listener)

    val generator = TranslatorGenerator(
        listener.startNonTerminal,
        listener.terminals.values,
        listener.nonTerminals.values
    )
    generator.generateFirst()
    generator.generateFollow()

    val terminals = listener.terminals.values
    val nonTerminals = listener.nonTerminals.values

    println(generator.first)
    println("FIRST':")
    nonTerminals.forEach { it.generateFirstPrime(generator.first, generator.follow) }

    val startNonTerminal = listener.startNonTerminal.name
    val skipCharacters = createSkipCharactersSet(listener.skippedCharacters)

    val attributes = listener.attributes.split(',').map { set -> set.trim() }.dropLast(1)
    val template = Template(terminals, nonTerminals, startNonTerminal, skipCharacters, attributes)

    createFile(dirName, "Lexer", template.lexer)
    createFile(dirName, "Source", template.source)
    createFile(dirName, "StringSource", template.stringSource)
    createFile(dirName, "ParsingException", template.parsingException)
    createFile(dirName, "ParsingTree", template.parsingTree)
    createFile(dirName, "Parser", template.parser)
    println("===== DONE =====\n")
}

fun createFile(dirName: String, fileName: String, content: String) {
    val dir = File("generated/$dirName/src")
    dir.mkdirs()

    val file = File(dir, "$fileName.kt")
    file.createNewFile()
    file.bufferedWriter().use { out ->
        out.write(content)
    }
}

fun createSkipCharactersSet(str: String): Set<String> {
    val result = hashSetOf<String>()
    var i = 0
    while (i < str.length) {
        if (str[i] == '\\') {
            if (i == str.length - 1) {
                result.add(str[i].toString())
            } else {
                if (str[i + 1] == '\\') {
                    result.add("\\")
                } else {
                    result.add("\\${str[i + 1]}")
                }
                i++
            }
        } else {
            result.add(str[i].toString())
        }
        i++
    }
    return result
}

fun parseGrammar(grammarFile: String, listener: GrammarParserListener) {
    val lexer = GrammarLexer(CharStreams.fromFileName(grammarFile, Charsets.UTF_8))
    val parser = GrammarParser(CommonTokenStream(lexer))

    val walker = ParseTreeWalker.DEFAULT
    walker.walk(listener, parser.grammarInfo())
}