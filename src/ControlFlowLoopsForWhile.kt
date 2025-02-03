package src

/*
============== CONTROL FLOW | LOOPS ==============
https://kotlinlang.org/docs/kotlin-tour-control-flow.html#loops

WHILE can be used in two ways:
- To execute a code block while a conditional expression is true. (while)
- to execute the code block first and then check the conditional expression. (do-while)

 */

fun main() {
    for (number in 1..5) {
        print(number)
    }

    println("--------------------")

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    println("--------------------")

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 3) {
        println("Eat a cake!")
        cakesEaten++
    }

    println("--------------------")

    do {
        println("Bake a cake!")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}
