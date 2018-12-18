package kotlinTest.variable

fun main(args: Array<String>) {
    var af1 = 5.23444455f
    //下面将看到 af1的值已经发生了变化
    println("af1的值为： $af1")

    //声明 af2为Float类型，但是25.2345默认类型为Double,所以编译错误
//    var af2 : Float = 25.2345

    // f1类型为Double
    var f1 = 5.12e2
    println("f1的值为： $f1")

    var a = 0.0
    //5.0/a的值 为 正无穷大  Infinity
    println("5.0/a的值：${5.0 / a}")

    //所有 正无穷大 数值都相等
    println(5.0 / a == 55000 / a)

    //-5.0/a的值 为 负无穷大 -Infinity
    println("-5.0/a的值：${-5.0 / a}")

    //所有 正无穷大 数值都相等
    println(-5.0 / a == -55000 / a)

    // 0.0 除以 0.0 将出现 非数 NaN
    var nan: Double = a / a
    println("a / a的值为:$nan")

    //非数 NaN与自己都不相等
    println(nan == nan)
}