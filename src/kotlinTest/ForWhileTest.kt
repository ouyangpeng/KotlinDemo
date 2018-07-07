package kotlinTest

import java.util.*

class ForWhileTest {
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> " FizzBuzz "
    i % 3 == 0 -> " Fizz "
    i % 5 == 0 -> " Buzz "
    else -> " $i "
}

fun main(args: Array<String>) {
    println("从前计数\n")
//    for (i in 1..100) {
    for (i in 1 until 100) {
        print(fizzBuzz(i))
    }
    println("\n从后计数\n")
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    println("\n\n\n转换字符为ASCII码\n")
    val binarayReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binarayReps[c] = binary
    }
    for ((letter, binary) in binarayReps) {
        println("$letter = $binary")
    }


    val list = arrayListOf<String>("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index : $element")
    }
}