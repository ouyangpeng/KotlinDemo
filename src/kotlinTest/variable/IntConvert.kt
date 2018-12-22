package kotlinTest.variable

fun main(args: Array<String>) {
    //Short 类型支持范围为 -32768~32767  所以下面编译出错
//    var negative: Short = 40000

    //Byte 类型支持范围为 -128~127  所以下面编译出错
//    var big: Byte = 128


    var bookPrice: Byte = 79
    var itemPrice: Short = 120

    // kotlin 不支持取值范围小的数据类型隐士转换为取值范围大的类型
    // kotlin 要求不同整型的变量或值直接必须进行显示转换

    //bookPrice是Byte类型，而变量a是Short类型
    // 下面报错  Error:(18, 20) Kotlin: Type mismatch: inferred type is Byte but Short was expected
//    var a: Short = bookPrice
    // 将bookPrice 强制转换为 SHort类型
    var b: Short = bookPrice.toShort()
    println("b= $b")

    // Kotlin 在表达式中可以自动转换，这种转换是给予上下文推断出来的
    // 算数表达式中的 bookPrice(Byte类型)和itemPrice(Short类型)自动提升为Int类型
    val total = bookPrice + itemPrice
    println("total = $total")
    println("total的类型为 = ${total.javaClass}")

    val tol = bookPrice.toLong() + itemPrice.toLong()
    println("tol = $tol")
    println("tol的类型为 = ${tol.javaClass}")

    val amount = 233
    //将Int类型转换为Byte类型，发生了溢出   //byteAmount = -23

    //程序将233 强制转换为8位的Byte类型整数，截取前面的24位，保留右边的8位,其中最左边的1是符号位，
    // 因此表明是一个负数，负数在计算机以补码形式存在，还需要转换为原码。
    // 公式：将补码减1得到反码形式，放码取反得到原码

    //十进制233二进制表示为 32位Int类型：  000000000000000011101001
    //           8位  Byte类型 补码形式：                  11101001
    //                         反码形式：                  11101000
    //                         原码形式：                  10010111
    // 从而变成了-(16+4+2+1) = -23
    val byteAmount: Byte = amount.toByte()
    println("byteAmount = $byteAmount")
}