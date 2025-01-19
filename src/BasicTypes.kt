package src

/*
https://kotlinlang.org/docs/kotlin-tour-basic-types.html
https://kotlinlang.org/docs/basic-types.html

| Category                | Basic types                | Example code                                                  |
|-------------------------|----------------------------|---------------------------------------------------------------|
| Integers                | Byte, Short, Int, Long     | `val year: Int = 2020`                                        |
| Unsigned integers       | UByte, UShort, UInt, ULong | `val score: UInt = 100u`                                      |
| Floating-point numbers  | Float, Double              | `val currentTemp: Float = 24.5f`, `val price: Double = 19.99` |
| Booleans                | Boolean                    | `val isEnabled: Boolean = true`                               |
| Characters              | Char                       | `val separator: Char = ','`                                   |
| Strings                 | String                     | `val message: String = "Hello, world!"`                       |
 */

// https://kotlinlang.org/docs/kotlin-tour-basic-types.html#practice

fun main() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}
