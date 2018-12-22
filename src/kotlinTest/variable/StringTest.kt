package kotlinTest.variable

fun main(args: Array<String>) {
    /**
     * Kotlin字符串有两种字面值（Literal)
     * 1. 转义字符串：转移字符串可以有转义符号
     * 2. 原始字符串：原始字符串可以保活换行和任意文本。 需要3个引号引起来。
     */

    //定义普通字符串
    var str = "https://blog.csdn.net/ouyang_peng/"
    println(str.length)

    // 默认情况下 Kotlin 使用 竖线( | ) 作为边界符，所有的 竖线( | ) 之前的内容都会被去掉
    var txt = """
        |☞ 本人QQ: 3024665621
        |☞ QQ交流群: 123133153
        |☞ github.com/ouyangpeng
        |☞ oypcz@foxmail.com
    """.trimMargin()
    println(txt)

    println("============================================")


    // 如果有必要，也可以使用其他字符作为边界符，此时需要在trimMargin()方法中传入该边界符作为参数
    var txt2 = """
        &☞ 本人QQ: 3024665621
        &☞ QQ交流群: 123133153
        &☞ github.com/ouyangpeng
        &☞ oypcz@foxmail.com
    """.trimMargin("&")
    println(txt2)

}