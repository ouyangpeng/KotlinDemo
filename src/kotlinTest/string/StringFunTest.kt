package kotlinTest.string

fun main(args: Array<String>) {
    val s1 = "2.35"
    // 将字符串转换为Double类型
    val d: Double = s1.toDouble()
    println(d)   //    2.35

    val s2 = "35"
    // 将字符串转换为Int类型
    val i: Int = s2.toInt()
    println(i)   //    35



    val s3 = "https://blog.csdn.net"
    //首字母大写
    println(s3.capitalize())    //   Https://blog.csdn.net
    //首字母小写
    println(s3.decapitalize())  //   https://blog.csdn.net

    // 返回两个字符串相同的前缀
    println(s3.commonPrefixWith("https://www.baidu.com"))   //   https://
    // 返回两个字符串相同的后缀
    println(s3.commonSuffixWith("https://mail.sina.net"))  //     .net

    var s4 = "java666"
    //正则表达式  是否包含连续3个数字
    println(s4.contains(Regex("\\d{3}")))
}