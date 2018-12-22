package kotlinTest.`null`

fun main(args: Array<String>) {

    // 安全调用  如果 b 不等于null，则返回b的长度，如果b为null，则返回null，不会导致NPE
    var b: String? = "oyp"
    println(b?.length)  // 3
    b = null
    println(b?.length)  // null


    var myArr: Array<String?> = arrayOf("oyp", null, "csdn", "xtc")
    for (item in myArr) {
        // 只有当item元素不为null才会执行的let函数
        item?.let { println(it) }
        //oyp
        //csdn
        //xtc
    }
}