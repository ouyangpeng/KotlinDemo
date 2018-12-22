package kotlinTest.variable

fun main(args: Array<String>) {
    var str = "ouyangpeng"

    // 由于str转换为Int有可能失败，故num有可能没有值，因此不能用Int来声明sum变量
//    var sum: Int = str.toIntOrNull()
    var sum: Int? = str.toIntOrNull()
    println("sum = $sum")  //sum = null

    // 编译器推断 n的类型为 Int?
    var n = str.toIntOrNull()

    var aStr: String = "oyp"
    var bStr: String? = "oyp"

    // 错误，aStr不接受 null， Error:(17, 12) Kotlin: Null can not be a value of a non-null type String
//    aStr = null
    bStr = null

    println(aStr.length)
    //编译不通过，Error:(22, 17) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // 可空类型不能直接调用方法或属性
//    println(bStr.length)


    // 先判断再使用

    var b: String? = "oyp"
    // 先判断b 不为空，然后再访问b的属性
    var len = if (b != null) b.length else -1
    println("b的长度为 $len")

    b = null
    if (b != null && b.length > 0){
        println("b的长度为 ${b.length}")
    } else {
        println("b为空字符串")
    }


    // 因为 Boolean? 类型，可以接受  true false null 三个值
    // 因此 对Boolean? 类型变量判断时，要显示与 true false 的值做比较

    var bParam : Boolean? = null
    if (bParam == true){
        println("为真")
    }
    // 下面的代码 会报错：Error:(47, 9) Kotlin: Type mismatch: inferred type is Boolean? but Boolean was expected
//    if (bParam){
//        println("为真")
//    }
}