package kotlinTest.variable

fun main(args: Array<String>) {
    /**
     * 1、所有Byte、Short类型 将被提升为Int类型
     * 2、整个算数表达式的数据类型自动提升 与 表达式中最高等级操作数同样的类型
     *
     *  Byte-->Short-->Int-->Long-->Float-->Double
     *
     *  3、表达式的类型将严格保持和表达式中最高等级操作数相同的类型
     */
    var sValue: Short = 5
    // 表达式中的sValue将自动提升为Int类型，则右边表达式类型为Int
    // 将Int类型赋值给Short类型，发送错误  Error:(7, 14) Kotlin: Type mismatch: inferred type is Int but Short was expected
    //    sValue = sValue - 2

    var b: Byte = 40
    var c: Short = 97
    var i: Int = 23
    var d: Double = .314

    // 右边表达式最高等级的操作数是d(Double类型)，因此右边表达式类型为Double，推断result将会是Double类型
    val result = b + c + i * d
    println("result = $result")                         //result = 144.222
    println("result的类型为 = ${result.javaClass}")     //result的类型为 = double

    // 表达式的类型将严格保持和表达式中最高等级操作数相同的类型
    // 右边表达式两个操作数都是Int类型，因此右边表达式类型为Int
    // 虽然 23/3 不能除尽  但是依然得到一个Int类型整数
    val intVar : Int = 3
    val intResult = 23 / intVar
    println("intResult = $intResult")                         //intResult = 7
    println("intResult的类型为 = ${intResult.javaClass}")     //intResult的类型为 = int
}