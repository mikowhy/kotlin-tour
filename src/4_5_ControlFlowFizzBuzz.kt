package src

// Fizz Buzz
// https://kotlinlang.org/docs/kotlin-tour-control-flow.html#loops-exercise-2

fun main() {
    val fizz = "fizz"
    val buzz = "buzz"

    for (number in 1..100) {
        when {
            number % 3 == 0 && number % 5 == 0 -> println("$fizz$buzz")
            number % 3 == 0 -> println(fizz)
            number % 5 == 0 -> println(buzz)
            else -> println("$number")
        }
    }

    println("----------------------")

    // In Kotlin, `it` is an implicit name for a single parameter in a lambda expression.
    // When a lambda has only one parameter, you don't need to explicitly name `it`;
    // you can use `it` instead

    println(
        (1..100).joinToString("\n") {
            when {
                it % 15 == 0 -> "$fizz$buzz"
                it % 3 == 0 -> fizz
                it % 5 == 0 -> buzz
                else -> "$it"
            }
        },
    )
}
