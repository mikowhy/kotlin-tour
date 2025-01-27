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
}
