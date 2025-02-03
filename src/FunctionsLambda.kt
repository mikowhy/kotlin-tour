package src

/*
https://kotlinlang.org/docs/kotlin-tour-functions.html#lambda-expressions

- Lambda expressions are written within curly braces {}
- the parameters followed by an `->`
- The body of a lambda expression is written after the `->`

Lambda expressions can be used in a number of ways. You can:
- Pass a lambda expression as a parameter to another function
- Return a lambda expression from a function
- Invoke a lambda expression on its own

 */

fun uppercaseString(text: String): String = text.uppercase()

fun toSeconds(time: String): (Int) -> Int =
    when (time) {
        "hour" -> { hours -> hours * 60 * 60 }
        "minute" -> { minutes -> minutes * 60 }
        "second" -> { seconds -> seconds }
        else -> { _ -> 0 }
    }

fun main() {
    println(uppercaseString(text = "hello, world!"))

    // Lambda expressions
    val upperCaseLambda: (String) -> String = { text: String -> text.uppercase() }
    println(upperCaseLambda("hello, world!"))

    // Pass a lambda expression as a parameter to another function
    val numbers = listOf(1, -1, 2, -2, 3, -3)

    val positives = numbers.filter { x -> x > 0 }
    val isPositive: (Int) -> Boolean = { x -> x > 0 }
    val positives2 = numbers.filter(isPositive)

    println(positives)
    println(positives2)

    val negatives = numbers.filter { x -> x < 0 }
    val isNegative: (Int) -> Boolean = { x -> x < 0 }
    val negatives2 = numbers.filter(isNegative)

    println(negatives)
    println(negatives2)

    val newNumbers = listOf(1, -1, 2, -2, 3, -3)

    val squared = newNumbers.map { x -> x * x }
    val isTripled: (Int) -> Int = { x -> x * 3 }

    println(squared)
    println(newNumbers.map(isTripled))

    val timeInMinutes = listOf(30, 60, 90)
    val min2sec = toSeconds(time = "minute")
    val totalTimeInSeconds = timeInMinutes.map(min2sec).sum()
    println(totalTimeInSeconds)

    val hour2sec = toSeconds(time = "hour")
    val totalTimeInSeconds2 = timeInMinutes.map(hour2sec).sum()
    println(totalTimeInSeconds2)

    // lambda Invoke separately
    println({ text: String -> text.uppercase() }("hello, world!"))

    // Trailing lambdas
    println(listOf(1, 2, 3, 4, 5).fold(0) { x, item -> x + item })

    // lambda exercises
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5

    val urls: String = actions.joinToString(separator = "\n") { action -> "$prefix/$id/$action" }
    println(urls)

    val urls2 = actions.map { action -> "$prefix/$id/$action" }
    println(urls2)

    fun repeatN(
        n: Int,
        action: () -> Unit,
    ) {
        for (i in 1..n) {
            action()
        }
    }

    repeatN(n = 3) {
        println("Hello")
    }
}
