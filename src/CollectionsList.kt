package src

/*

============== LIST ==============

https://kotlinlang.org/docs/kotlin-tour-collections.html

| Collection Type | Description                                                             |
|-----------------|-------------------------------------------------------------------------|
| List            | Ordered collections of items                                            |
| Set             | Unique unordered collections of items                                   |
| Map             | Sets of key-value pairs where keys are unique and map to only one value |

 */

// Read only list
val readOnlyShapes = listOf("circle", "triangle", "rectangle")

// Mutable list with explicit type declaration
val mutableShapes: MutableList<String> = mutableListOf("circle", "triangle", "rectangle")

fun main() {
    println(readOnlyShapes)
    println(mutableShapes)

    // Create a read-only view of a mutable list by assigning it to a `List`
    val shapes: MutableList<String> = mutableListOf("circle", "triangle", "rectangle")
    val shapesLocked: List<String> = shapes

    // get i-element of list
    println("Get i-element of list (shapes[1]): ${shapes[1]}")
    println("Get first element of list (shapes.first()): ${shapes.first()}")
    println("Get last element of list (shapes.last()): ${shapes.last()}")

    println("Count of elements in list (shapes.count()): ${shapes.count()}")

    print("Check if `\"circle\" in shapes`: ")
    println("circle" in shapes)

    // ADD / REMOVE ELEMENTS
    val myShapes: MutableList<String> = mutableListOf("circle", "triangle", "rectangle", "circle")
    myShapes.add("square")

    myShapes.remove("circle")
    println("myShapes after add and remove: $myShapes")
}
