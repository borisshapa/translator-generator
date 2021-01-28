# Translator Generator

Generates recursive parser code in Kotlin.
The input takes the path to the file LL1 grammar. Inherited and synthesized attributes are supported.
The attributes must be described at the beginning of the file.
After each rule, actions on attributes (first on synthesized, then on inherited) are indicated. 

Example grammar (calculator):

```
{ value: Double = 0.0 }
{ acc: Double = 0.0 }

E -> T E1          { value = children[1].value } { E1.acc = children[0].value }
E1 -> '+' T E1     { value = children[2].value } { E1.acc = res.acc + children[1].value }
E1 -> '-' T E1     { value = children[2].value } { E1.acc = res.acc - children[1].value }
E1 -> \eps         { value = res.acc }
T -> P T1          { value = children[1].value } { T1.acc = children[0].value }
T1 -> '*' P T1     { value = children[2].value } { T1.acc = res.acc * children[1].value }
T1 -> '/' P T1     { value = children[2].value } { T1.acc = res.acc / children[1].value }
T1 -> \eps         { value = res.acc }
P -> F P1          { value = Math.pow(children[0].value, children[1].value) }
P1 -> '^' F P1     { value = Math.pow(children[1].value, children[2].value) }
P1 -> \eps         { value = 1.0 }
F -> [0-9]+        { value = children[0].content.toDouble() }
F -> '(' E ')'     { value = children[1].value }
[ \n\t\r] -> skip
```
