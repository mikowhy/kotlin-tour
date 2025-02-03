package src

/*
============== CONTROL FLOW | IF ==============
https://kotlinlang.org/docs/kotlin-tour-control-flow.html

If you have to choose between `if` and `when`, we recommend using `when` because it:
  - Makes your code easier to read
  - Makes it easier to add another branch
  - Leads to fewer mistakes in your code
 */

fun main() {
    val firstTry: Int
    val secondTry: Int
    val check = true

    if (check) {
        firstTry = 1
    } else {
        firstTry = 2
    }
    println("firstTry: $firstTry")

    secondTry =
        if (check) {
            1
        } else {
            2
        }
    println("secondTry: $secondTry")

    // if can be used as an expression
    val a = 1
    val b = 2

    // Warning:(36, 17) Condition 'a > b' is always false -> I know - just an example!!!
    println(if (a > b) "a is greater than b" else "a is not greater than b")
}
