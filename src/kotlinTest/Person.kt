package kotlinTest


class Person(val name: String, var isMarried: Boolean) {

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun max2(a: Int, b: Int): Int = if (a > b) a else b

    fun max3(a: Int, b: Int) = if (a > b) a else b
}

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello,$name")

    val person = Person("Bob", true)
    println(person.name)
    print(person.isMarried)
}