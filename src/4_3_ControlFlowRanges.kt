package src

/*
============== CONTROL FLOW | RANGES ==============
https://kotlinlang.org/docs/kotlin-tour-control-flow.html#ranges

..
- range in Kotlin -> use the .. operator: 1..4 is equivalent to 1, 2, 3, 4
- 'a'..'d' is equivalent to 'a', 'b', 'c', 'd'

..<
- don't include the end value, ->  ..< operator: 1..<4 is equivalent to 1, 2, 3.

downTo
- 4 downTo 1 is equivalent to 4, 3, 2, 1

1..5 step 2
- 1..5 step 2 is equivalent to 1, 3, 5
- 'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'
 */

fun main() {
    // range in Kotlin
    println(" ----------------- i in 1..4 -----------------")
    for (i in 1..4) {
        print(i)
    }
    println("")

    // 'a'..'d' is equivalent to 'a', 'b', 'c', 'd'
    println(" ----------------- 'a'..'d' -----------------")
    for (char in 'a'..'d') {
        print(char)
    }
    println("")

    // ..< operator
    println(" ----------------- 1 until 4 -----------------")
    for (i in 1 until 4) {
        print(i)
    }
    println("")

    // downTo
    println(" ----------------- 4 downTo 1 -----------------")
    for (i in 4 downTo 1) {
        print(i)
    }
    println("")

    // 1..5 step 2
    println(" ----------------- 1..5 step 2 -----------------")
    for (i in 1..5 step 2) {
        print(i)
    }
    println("")

    // 'z' downTo 's' step 2
    println(" ----------------- 'z' downTo 's' step 2 -----------------")
    for (char in 'z' downTo 's' step 2) {
        print(char)
    }
    println("")
}
