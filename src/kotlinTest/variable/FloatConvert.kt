package kotlinTest.variable

fun main(args: Array<String>) {
    var width: Float = 2.3f
    var height: Double = 4.5

    // width 必须显示强制转换为Double类型之后，才能赋值给a
    var a: Double = width.toDouble()
    println("a = $a")       //a = 2.299999952316284

    // 将 height强制转换为Float之后再进行计算，整个表达式类型为Float
    var area1 = width * height.toFloat()
    println("area1 = $area1")           //area1 = 10.349999
    println("area1的类型为 = ${area1.javaClass}")           // area1的类型为 = float

    // 表达式中 height 是Double类型，它是等级最高的运算符
    // 因此整个表达式类型为Double类型
    var area2 = width * height
    println("area2 = $area2")           //area2 = 10.349999785423279
    println("area2的类型为 = ${area2.javaClass}")           //area2的类型为 = double


    val multi: Int = 5
    val totalHeight1 = height * multi
    println("totalHeight1 = $totalHeight1")           //totalHeight1 = 22.5
    println("totalHeight1的类型为 = ${totalHeight1.javaClass}")           //totalHeight1的类型为 = double
    val totalHeight2 = height.toInt() * multi

    // 将height强制转换为Int类型后进行计算，因此整个表达式类型为Int
    println("totalHeight2 = $totalHeight2")           //totalHeight2 = 20
    println("totalHeight2的类型为 = ${totalHeight2.javaClass}")           //totalHeight2的类型为 = int
}