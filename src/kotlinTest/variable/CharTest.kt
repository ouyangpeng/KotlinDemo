package kotlinTest.variable

/**
 * 与Java不同的是，Kotlin的Char类型变量不能当做整数型使用。
 *
 * Char型变量或者表达式不能赋值给整型变量，整型变量或者表达式不能赋值给Char型变量
 *
 */
fun main(args: Array<String>) {

    // 直接使用 单个字符 作为字符值
    val aChar: Char = 'a'
    println(aChar)
    // 使用 转义符 作为字符值
    val enterChar: Char = '\r'
    println(enterChar)
    //使用Unicorn编码值来指定字符值
    val ch: Char = '\u9999' //香
    println(ch)

    val zhong: Char = '中'
    println(zhong)
    //将Char类型变量当成Int型 处理会报错
//    var zhongValue: Int = zhong

}