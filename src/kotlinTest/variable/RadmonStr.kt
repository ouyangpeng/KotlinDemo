package kotlinTest.variable

fun main(args: Array<String>) {
    var result = ""
    for (i in 0..10) {
        // 生成一个 97-122 之间的Int类型整数
        val intVal = (Math.random() * 26 + 97).toInt()
        // 将Int类型整数强制转换为Char类型后连接到result后面
        result = result + intVal.toChar()
    }
    println(result)
}