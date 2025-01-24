package src

/*
============== CONTROL FLOW | WHEN ==============
https://kotlinlang.org/docs/kotlin-tour-control-flow.html

If you have to choose between `if` and `when`, we recommend using `when` because it:
  - Makes your code easier to read
  - Makes it easier to add another branch
  - Leads to fewer mistakes in your code

  - Use when when you have a conditional expression with multiple branches
  - Note that all branch conditions are checked sequentially until one of them is satisfied. So only the first suitable branch is executed.
 */

fun main() {
    // when usage with subject
    val obj = "Hello"

    val result =
        when (obj) {
            // 'when' branch is never reachable  -> I know - it's just an example
            "1" -> "One"
            "2" -> "Two"
            "Hello" -> "Hello"
            else -> "Nothing"
        }

    println(result)

    // when usage without subject
    val trafficLightState = "red"

    val trafficAction =
        // 'when' with subject should be used (should / have to or can)?
        // Using when with a subject makes your code easier to read and maintain
        // if you don't use a subject with a when expression, you need to provide an else branch
        when {
            // Condition 'trafficLightState == "red"' is always true -> I know - it's just an example
            trafficLightState == "red" -> "Stop"
            trafficLightState == "yellow" -> "Slow down"
            trafficLightState == "green" -> "Go"
            else -> "Unknown"
        }

    println(trafficAction)

    val trafficAction2 =
        when (trafficLightState) {
            "red" -> "Stop"
            // 'when' branch is never reachable -> I know - it's just an example
            "yellow" -> "Slow down"
            // 'when' branch is never reachable -> I know - it's just an example
            "green" -> "Go"
            else -> "Unknown"
        }

    println(trafficAction2)
}
