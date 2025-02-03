package src

// https://kotlinlang.org/docs/kotlin-tour-hello-world.html

var customers: Int = 10 // There are 10 customers in the queue

/*
// Variable declared without initialization
val d: Int // -> Kotlin: Property must be initialized.

// Variable initialized
d = 3

// Variable explicitly typed and initialized
val e: String = "hello"

*/

fun main() {
    print("Hello, World!") // no new line
    println("Hello, World!") // add new line

    // As customers is a mutable variable, its value can be reassigned after declaration.
    customers = 8

    println("There are $customers customers")
    println("Add 1 customer and we have ${customers + 1} customers")
}
