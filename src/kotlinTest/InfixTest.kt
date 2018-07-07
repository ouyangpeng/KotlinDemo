package kotlinTest

class InfixTest{
    infix fun Any.to(other: Any) = Pair(this, other)
}

fun main(args: Array<String>) {
    val (number,name) = 1 to "One"
}

