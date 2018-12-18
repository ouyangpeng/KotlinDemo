package kotlinTest.variable

fun main(args:Array<String>){
    //以 0b或0B开头的整数数值是二进制的整数
    var binValue1 = 0b1010101
    var binValue2 = 0B10101010

    //以 0x或0X开头的整数数值是十六进制的整数
    var hexValue1 = 0x13
    var hexValue2 = 0xaF

    //Kotlin不支持八进制的整数，支持十进制、二进制、十六进制

    println("binValue1的值为： $binValue1")
    println("binValue2的值为： $binValue2")
    println("hexValue1的值为： $hexValue1")
    println("hexValue2的值为： $hexValue2")

    // 提高可读性，允许为数值增加下划线作为分隔符
    val oneMillion = 1_000_000
    val price = 234_234_234
    val android = 1234_1234
    println("oneMillion的值为： $oneMillion")
    println("price的值为： $price")
    println("android的值为： $android")
}