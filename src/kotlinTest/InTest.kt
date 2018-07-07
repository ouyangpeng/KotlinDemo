package kotlinTest

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "I don't know..."
}

fun main(args: Array<String>) {
    println(isLetter('q'))

    println(isNotDigit('X'))

    println(recognize('9'))
    println(recognize('!'))

    //你能枚举"Java"和"Kotlin"直接的所有字符串吗？不，你做不到，但是你可以使用in操作符来检查一个对象是否在这个范围内
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in "Java".."Kotlin")
    println("Kotlin" in "Kotlin".."Scala")
}

