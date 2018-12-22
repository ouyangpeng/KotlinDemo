package kotlinTest.variable

fun main(args: Array<String>) {
    var str = "ouyangpeng"

    // 由于str转换为Int有可能失败，故num有可能没有值，因此不能用Int来声明sum变量
//    var sum: Int = str.toIntOrNull()
    var sum: Int? = str.toIntOrNull()
    println("sum = $sum")  //sum = null

    // 编译器推断 n的类型为 Int?
    var n = str.toIntOrNull()

    var aStr :String = "oyp"
    var bStr :String? = "oyp"

    // 错误，aStr不接受 null， Error:(17, 12) Kotlin: Null can not be a value of a non-null type String
//    aStr = null
    bStr = null

    println(aStr.length)
    //编译不通过，Error:(22, 17) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//    println(bStr.length)
}