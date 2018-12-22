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
    val intVar: Int = 3
    val intResult = 23 / intVar
    println("intResult = $intResult")                         //intResult = 7
    println("intResult的类型为 = ${intResult.javaClass}")     //intResult的类型为 = int


    // 1、先进行 "Hello!" + 'a' 运算，把'a'转换成字符串，拼接成    Hello!a
    // 2、然后再进行 Hello!a + 7运算  也是字符串连接运算,拼接成    Hello!a7
    println("Hello!" + 'a' + 7)  //Hello!a7

    // 1、先进行 'a'  + 7 运算，此时是对Char型值做加法运算，将会得到 'a'后面的第7个字符（字符编码加7），因此得到 'h'
    // 2、然后再进行 'h' + "Hello!" 运算，此时把'h'转换成字符串,字符串连接运算,拼接成  hHello!
    println('a' + 7 + "Hello!")  //hHello!
}