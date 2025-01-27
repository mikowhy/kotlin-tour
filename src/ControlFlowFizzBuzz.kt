package src

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
