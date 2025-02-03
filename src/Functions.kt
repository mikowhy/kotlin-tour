package src

import kotlin.math.PI

/*
https://kotlinlang.org/docs/kotlin-tour-functions.html

- Function parameters are written within parentheses ()
- Each parameter must have a type, and multiple parameters must be separated by commas ,.
- The return type is written after the function's parentheses (), separated by a colon :.
- The body of a function is written within curly braces {}.
- The return keyword is used to exit or return something from a function.
- If a function doesn't return anything useful, the return type and return keyword can be omitted

 */

fun hello() = println("Hello, World!")

fun printMessageWithPrefix(
    message: String,
    prefix: String = "Info", // Default parameter value
) {
    println("[$prefix] $message")
}

fun printMessageWithPrefixWithReturn(
    message: String,
    prefix: String = "Info", // Default parameter value
): String = "[$prefix] $message"

// Single-expression functions
// If a function returns a single expression, the curly braces {} can be omitted, and the body is specified after = symbol
// You can remove the curly braces {} and declare the function body using the assignment operator =

fun sum(
    x: Int,
    y: Int,
): Int = x + y

fun multiply(
    x: Int,
    y: Int,
): Int = x * y

// Early returns in functions

val registeredUsernames = mutableListOf("Alice", "Bob", "Charlie")
val registeredEmails = mutableListOf("alice@example.com", "bob@example.com", "charlie@example.com")

fun registerUser(
    username: String,
    email: String,
): String {
    if (username in registeredUsernames) {
        return "Username is already taken"
    }

    if (email in registeredEmails) {
        return "Email is already taken"
    }

    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User: $username with email: $email registered successfully"
}

// exercises
fun calculateCircleArea(radius: Int): Double = PI * radius * radius

fun intervalInSeconds(
    hours: Int = 0,
    minutes: Int = 0,
    seconds: Int = 0,
): Int = hours * 3600 + minutes * 60 + seconds

fun main() {
    hello()
    println(sum(x = 5, y = 6))

    printMessageWithPrefix(message = "Hello")
    printMessageWithPrefix(message = "Hello", prefix = "Log")
    println(printMessageWithPrefixWithReturn(message = "Hello"))
    println(multiply(x = 5, y = 6))

    println(registerUser(username = "Alice", email = "test@example.com"))
    println(registerUser(username = "mikolaj", email = "mikolaj@example.com"))

    println(calculateCircleArea(radius = 5))

    println(intervalInSeconds(hours = 1, minutes = 30, seconds = 0))
    println(intervalInSeconds(minutes = 30, seconds = 0))
    println(intervalInSeconds(seconds = 30))
}
