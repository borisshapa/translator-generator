import TranslatorGenerator.Companion.EPS

class Node(val name: String) {
    val folds = mutableListOf<Fold>()
    lateinit var firstPrime: MutableMap<Fold, Collection<String>>

    fun addFold(fold: Fold) {
        folds.add(fold)
    }

    fun generateFirstPrime(
        first: Map<String, Collection<String>>,
        follow: Map<String, Collection<String>>
    ) {
        firstPrime = hashMapOf()
        for (fold in folds) {
            val nodes = fold.nodes
            val result = hashSetOf<String>()
            var i = 0
            while (i < nodes.size && nodes[i].isEps()) {
                result.addAll(first[nodes[i].name]!!.filter { it != EPS })
                i++
            }
            if (i < nodes.size) {
                val nodeFirst = first[nodes[i].name]
                if (nodeFirst != null) {
                    result.addAll(nodeFirst.filter { it != EPS })
                } else {
                    result.add(nodes[i].name)
                }
            } else {
                result.addAll(follow[name]!!)
            }
            println("$name -> $fold     $result")
            firstPrime[fold] = result
        }
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("$name -> ")
        for (child in folds) {
            sb.append("$child ")
        }
        return sb.toString()
    }

    fun isEps(): Boolean {
        for (fold in folds) {
            if (fold.isEps()) {
                return true
            } else {
                var isEps = true
                for (foldNode in fold.nodes) {
                    if (!foldNode.isEps()) {
                        isEps = false
                        break
                    }
                }
                if (isEps) {
                    return true
                }
            }
        }
        return false
    }

    class Fold {
        val nodes = mutableListOf<Node>()
        var sAttributes: String? = null
        var iAttributes: Pair<String, String>? = null

        fun addNode(node: Node) {
            nodes.add(node)
        }

        override fun toString(): String {
            val sb = StringBuilder()
            for (node in nodes) {
                sb.append("${node.name} ")
            }
            if (isEps()) {
                sb.append("\\eps")
            }
            return sb.toString()
        }

        fun isEps(): Boolean {
            return nodes.isEmpty()
        }
    }
}