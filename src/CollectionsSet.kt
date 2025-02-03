package src

/*

============== SET ==============
https://kotlinlang.org/docs/kotlin-tour-collections.html#set

- sets are unordered and only store unique items

| Collection Type | Description                                                             |
|-----------------|-------------------------------------------------------------------------|
| List            | Ordered collections of items                                            |
| Set             | Unique unordered collections of items                                   |
| Map             | Sets of key-value pairs where keys are unique and map to only one value |

 */

// Read only set
val readOnlySet = setOf("apple", "banana", "kiwi")

// Mutable set with explicit type declaration
val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "kiwi", "kiwi")

fun main() {
    val myFruit: String = "apple"

    println(fruits)
    println(fruits.count())
    println(myFruit in fruits)

    fruits.add("orange")
    fruits.remove("kiwi")
    println(fruits)
}
