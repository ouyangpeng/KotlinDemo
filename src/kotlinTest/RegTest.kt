package kotlinTest

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir:$directory, fullName:$fullName, name:$fileName, ext:$extension")
}

fun parsePathRegexp(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir:$directory, name:$filename, ext:$extension")
    }
}


fun main(args: Array<String>) {
    parsePath("/Users/ouyangpeng/chart.kt")
    parsePathRegexp("/Users/ouyangpeng/chart.kt")

    //多行三引号字符串
    val kotlinLogo = """| //
        .|//
        .|/\"""
    println(kotlinLogo.trimMargin("."))
}