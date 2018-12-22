package kotlinTest.string

fun main(args: Array<String>) {
    // 在字符串中 嵌入 变量
    var bookPrice = 89
    var s = "价格是：${bookPrice}"
    println(s)

    // 在字符串中 嵌入 方法调用
    var random = java.util.Random()
    var s2 = "伪随机数是：${random.nextInt(100)}"
    println(s2)

    var blog = "https://blog.csdn.net/ouyang_peng/"
    println("${blog}的长度是：${blog.length}")

    var QQ = "3024665621"
    var QQGroup = "123133153"
    var txt = """
        |☞ 本人QQ: ${QQ}
        |☞ QQ交流群:  ${QQGroup}
        |☞ 博客地址${blog}
    """.trimMargin()
    println(txt)
}