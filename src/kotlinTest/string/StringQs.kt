package kotlinTest.string

fun main(args: Array<String>) {
    var str = "https://blog.csdn.net/ouyang_peng/"
    println(str[2])
    println(str[5])
    println(str[10])
    //循环遍历str字符串中的每个字符
    for (c in str){
        println(c)
    }
}