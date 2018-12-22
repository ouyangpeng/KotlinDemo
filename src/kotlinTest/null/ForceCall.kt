package kotlinTest.`null`

fun main(args: Array<String>) {
    //安全调用 ?.
    //强制调用 !!.

    //用 !! 即可强制调用可空变量的方法或属性 这样强制调用可能引发NPE
    var b: String? = "oyp"
    println(b!!.length)  // 3
    b = null
    println(b!!.length)  // 引发 kotlin.KotlinNullPointerException 空指针异常


    var myArr: Array<String?> = arrayOf("oyp", null, "csdn", "xtc")
    for (item in myArr) {
        // 只有当item元素不为null才会执行的let函数
        item!!.let { println(it) }
        //oyp
        //csdn
        //xtc
    }
}