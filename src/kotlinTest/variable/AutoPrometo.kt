package kotlinTest.variable

fun main(args: Array<String>) {
    /**
     * 1、所有Byte、Short类型 将被提升为Int类型
     * 2、整个算数表达式的数据类型自动提升 与 表达式中最高等级操作数同样的类型
     *
     *  Byte-->Short-->Int-->Long-->Float-->Double
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
}