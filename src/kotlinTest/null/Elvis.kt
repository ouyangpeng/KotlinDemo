package kotlinTest.`null`

fun main(args: Array<String>) {

    var b: String? = "oyp"
    var len1 = if (b != null) b.length else -1
    println(len1)

    b = null
    //使用 Elvis运算符
    //若第一个运算数不为null，运算结果就是第一个运算数；
    //若第一个运算数为null，运算结果就是第二个运算数。
    var len2 = b?.length ?: -1
    println(len2)
}