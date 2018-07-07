import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        println("数字转换出错啦！")
        return null
    } finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}


fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    val reader2 = BufferedReader(StringReader("239aaa"))
    println(readNumber(reader2))

    val reader3 = BufferedReader(StringReader("not a number"))
    println(readNumber2(reader3))
}