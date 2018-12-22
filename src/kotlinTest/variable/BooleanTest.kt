package kotlinTest.variable

/**
 * 与Java不同的是，Kotlin的Char类型变量不能当做整数型使用。
 *
 * Char型变量或者表达式不能赋值给整型变量，整型变量或者表达式不能赋值给Char型变量
 *
 */
fun main(args: Array<String>) {
    var b1: Boolean = true
    var b2: Boolean = false

    // Boolean类型的变量同样可以“插入”到字符串中
    var str :String = "${b1}代表真"
    var str2 :String = "${b2}代表假"

    println(str)
    println(str2)
}