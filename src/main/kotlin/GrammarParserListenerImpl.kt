import generator.GrammarParser
import generator.GrammarParserBaseListener

class GrammarParserListenerImpl : GrammarParserBaseListener() {
    val terminals = linkedMapOf<String, Node>()
    val nonTerminals = hashMapOf<String, Node>()
    var attributes = ""
    var skippedCharacters = ""

    lateinit var startNonTerminal: Node

    override fun enterSkipRule(ctx: GrammarParser.SkipRuleContext?) {
        skippedCharacters += trim(ctx!!.Brackets().text)
    }

    override fun enterInitAttribute(ctx: GrammarParser.InitAttributeContext?) {
        attributes += trim(ctx!!.Attribute().text) + ", "
    }

    override fun enterFold(ctx: GrammarParser.FoldContext?) {
        val ruleName = ctx!!.Node().text
        val children = ctx.ruleChild()
        children.removeAll { it.terminal() != null && it.terminal().Eps() != null }

        val fold = Node.Fold()

        var text = ""
        for (transition in children) {
            val terminal = transition.terminal()
            val nonTerminal = transition.Node()

            when {
                terminal != null -> {
                    val string = terminal.String()
                    val regex = terminal.regex()
                    text += if (string != null) {
                        trim(string.text)
                    } else {
                        regex.text.replace("\\", "\\\\")
                    }
                }
                nonTerminal != null -> {
                    if (text.isNotEmpty()) {
                        fold.addNode(addTerminalRule(text))
                        text = ""
                    }
                    fold.addNode(addNonTerminalRule(nonTerminal.text))
                }
                else -> {
                    throw RuntimeException("Unexpected node")
                }
            }
        }
        if (text.isNotEmpty()) {
            fold.addNode(addTerminalRule(text))
        }

        val synthesized = ctx.Attribute(0)
        val inherited = ctx.Attribute(1)
        if (synthesized != null) {
            fold.sAttributes = "{ res.${synthesized.text.drop(1).trim()}"
            if (inherited != null) {
                val withoutBrace = inherited.text.drop(1).trim()
                val pointInd = withoutBrace.indexOf('.')
                val nonTerminal = withoutBrace.substring(0, pointInd)
                val action = "{ it${withoutBrace.substring(pointInd)}"
                fold.iAttributes = nonTerminal to action
            }
        }
        val node: Node = addNonTerminalRule(ruleName)
        node.addFold(fold)

        if (!this::startNonTerminal.isInitialized) {
            startNonTerminal = node
        }
    }

    private fun addRule(map: MutableMap<String, Node>, ruleName: String): Node {
        if (!map.containsKey(ruleName)) {
            map[ruleName] = Node(ruleName)
        }
        return map.get(ruleName)!!
    }

    private fun addTerminalRule(ruleName: String): Node =
        addRule(terminals, ruleName)

    private fun addNonTerminalRule(ruleName: String): Node =
        addRule(nonTerminals, ruleName)

    private fun trim(str: String): String {
        return str.drop(1).dropLast(1)
    }
}