package kotlinTest.variable

fun main(args: Array<String>) {
    var c1 = 'i'
    var c2 = 'k'

    // Char型值  加、减 一个整数型
    // Kotlin 会先将Char型值对应的字符编码进行加、减该整数，然后将计算结果转换为Char型值
    println(c1 + 4)         //m
    println(c1 - 4)         //e
    println(c1 + 400)       //ǹ
    println(c1 - 400)       //ﻙ

    // 两个Char型值 相减
    // Kotlin 会先将两个Char型值对应的字符编码进行减法运算，最后返回Int类型的值。
    println(c1 - c2)       //-2

    // 两个Char型值 不能相加  Error:(17, 18) Kotlin: Type mismatch: inferred type is Char but Int was expected
//    println(c1 + c2)
}