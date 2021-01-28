class TranslatorGenerator(
    private val startNonTerminal: Node,
    private val terminals: MutableCollection<Node>,
    private val nonTerminals: MutableCollection<Node>
) {
    companion object {
        const val EPS = "EPS"
        const val END = "$"
    }
    val first = hashMapOf<String, MutableSet<String>>()
    val follow = hashMapOf<String, MutableSet<String>>()

    fun generateFirst() {
        println("NON TERMINALS: " + nonTerminals.map { it.name })
        println("TERMINALS: " + terminals.map { it.name })
        for (nonTerminal in nonTerminals) {
            first[nonTerminal.name] = hashSetOf()
        }

        for (i in nonTerminals.indices) {
            do {
                var changed = false
                for (nonTerminal in nonTerminals) {
                    val values = hashSetOf<String>()
                    for (fold in nonTerminal.folds) {
                        var ind = 0
                        val foldNodes = fold.nodes
                        while (ind < foldNodes.size && foldNodes[ind].isEps()) {
                            val foldNode = foldNodes[ind]
                            values.addAll(first[foldNode.name]!!)
                            ind++
                        }
                        if (ind < foldNodes.size) {
                            val foldNode = foldNodes[ind]
                            if (terminals.contains(foldNode)) {
                                values.add(foldNode.name)
                            } else {
                                values.addAll(first[foldNode.name]!!)
                            }
                        } else {
                            values.add(EPS)
                        }
                    }
                    changed = first[nonTerminal.name]!!.addAll(values)
                }
            } while (changed)
        }
    }


    private fun addToFollow(nonTerminalName: String, values: MutableSet<String>): Boolean {
        if (!follow.containsKey(nonTerminalName)) {
            follow[nonTerminalName] = values
            return true
        }
        return follow[nonTerminalName]!!.addAll(values)
    }

    fun generateFollow() {
        for (nonTerminal in nonTerminals) {
            follow[nonTerminal.name] = hashSetOf()
        }
        follow[startNonTerminal.name]!!.add(END)

        do {
            var changed = false
            for (nonTerminal in nonTerminals) {
                for (fold in nonTerminal.folds) {
                    val foldNodes = fold.nodes
                    if (foldNodes.size > 1) {
                        for (i in foldNodes.size - 2 downTo 0) {
                            if (terminals.contains(foldNodes[i])) {
                                continue
                            }
                            val foldNode = foldNodes[i + 1]
                            changed = changed || addToFollow(
                                foldNodes[i].name,
                                if (terminals.contains(foldNode))
                                    hashSetOf(foldNode.name)
                                else
                                    first[foldNode.name]!!.filter { it != EPS }.toMutableSet()
                            )
                        }
                    }
                    var ind = foldNodes.size - 1
                    while (ind > 0 && !terminals.contains(foldNodes[ind])) {
                        changed = changed || addToFollow(foldNodes[ind].name, follow[nonTerminal.name]!!)

                        if (!first[foldNodes[ind].name]!!.contains(EPS)) {
                            break
                        }
                        ind--
                    }
                }
            }
        } while (changed)
    }
}