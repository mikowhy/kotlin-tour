// https://kotlinlang.org/docs/kotlin-tour-hello-world.html

var customers = 10 // There are 10 customers in the queue

fun main() {
    print("Hello, World!") // no new line
    println("Hello, World!") // add new line

    // As customers is a mutable variable, its value can be reassigned after declaration.
    customers = 8

    println("There are $customers customers")
    println("Add 1 customer and we have ${customers + 1} customers")
}
