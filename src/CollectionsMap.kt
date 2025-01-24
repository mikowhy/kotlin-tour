package src

/*
============== MAP ==============
https://kotlinlang.org/docs/kotlin-tour-collections.html#map

- Every key in a map must be unique
- You can have duplicate values in a map.

| Collection Type | Description                                                             |
|-----------------|-------------------------------------------------------------------------|
| List            | Ordered collections of items                                            |
| Set             | Unique unordered collections of items                                   |
| Map             | Sets of key-value pairs where keys are unique and map to only one value |
 */

fun main() {
    // Read only map
    val readOnlyJuiceMenu = mapOf("orange" to 3.5, "apple" to 4.0, "carrot" to 5.0)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val mutableJuiceMenu: MutableMap<String, Double> = mutableMapOf("orange" to 3.5, "apple" to 4.0, "carrot" to 5.0)
    println(mutableJuiceMenu)

    // creating read-only view of a mutable map
    val juiceMenu: MutableMap<String, Double> = mutableMapOf("orange" to 1.11, "apple" to 2.22, "carrot" to 3.33)
    val juiceMenuLocked: Map<String, Double> = juiceMenu
    println(juiceMenuLocked)

    // access value by key
    println("Price of apple juice: ${juiceMenuLocked["apple"]}")

    // add key-value pair
    juiceMenu["banana"] = 6.0

    for ((fruit, price) in juiceMenuLocked) {
        println("Price of $fruit juice: $price")
    }

    // remove key-value pair
    juiceMenu.remove("carrot")

    // get number of key-value pairs
    val numberOfItemsInMenu: Int = juiceMenu.count()
    println(numberOfItemsInMenu)

    // check if key exists
    val isInMap: Boolean = juiceMenu.containsKey("apple")
    println(isInMap)

    // keys and values
    val fruits: Set<String> = juiceMenu.keys
    val prices: Collection<Double> = juiceMenu.values
    println("Fruits: $fruits")
    println("Prices: $prices")

    // access to keys
    val isInKeys: Boolean = ("apple" in juiceMenu.keys)
    val isInKeys2: Boolean = ("apple" in juiceMenu)
    println("Is apple in keys: $isInKeys | $isInKeys2")

    // access to values
    val isInValues: Boolean = (3.33 in juiceMenu.values)
    println("Is 3.33 in values: $isInValues")
}
