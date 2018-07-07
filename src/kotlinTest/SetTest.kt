@file:JvmName("SetTestKt")

package kotlinTest

fun main(args: Array<String>) {
    val set = setOf<Int>(1, 5, 6)
    val list = listOf<Int>(1, 5, 6)
    val map = mapOf<Int, String>(1 to "one", 5 to "five", 6 to "six")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(set)
    println(list)
    println(map)

    val strings = listOf<String>("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())

    val list2 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(joinToString(list2, "_", "(", ")"))
    println(joinToString(list2, ",", "[", "]"))
    println(joinToString(list2, separator = "|", prefix = "{", postFix = "}"))

    println(joinToString(list2))
    println(joinToString(list2, ";"))
    println(joinToString(list2, prefix = "# "))


    println(list2.joinToStringMethod(prefix = "# "))
    println(list2.joinToStringMethod(separator = "|", prefix = "{", postFix = "}"))
    println(list2.joinToStringMethod())
    println(list2.joinToStringMethod(";"))


    println(listOf("one","two","three").join(" "))
    println(listOf("one","two","three").join("______"))
}

/**
 * 拼接字符串
 * @param collection 集合
 * @param separator 分隔符
 * @param prefix 前缀
 * @param postFix 后缀
 */
@JvmOverloads
fun <T> joinToString(collection: Collection<T>, separator: String = ", ", prefix: String = "", postFix: String = ""): String {
    //前缀
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        //在第一个元素之前不添加分隔符
        if (index > 0) result.append(separator)
        //添加集合元素
        result.append(element)
    }
    //后缀
    result.append(postFix)
    return result.toString()
}

/**
 * Kotlin标准版本的 拼接字符串函数
 * @param separator 分隔符
 * @param prefix 前缀
 * @param postFix 后缀
 */
fun <T> Collection<T>.joinToStringMethod( //用 Collection<T> 声明一个扩展函数
        separator: String = ", ",
        prefix: String = "",
        postFix: String = ""
): String {
    //前缀
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        //在第一个元素之前不添加分隔符
        if (index > 0) result.append(separator)
        //添加集合元素
        result.append(element)
    }
    //后缀
    result.append(postFix)
    return result.toString()
}

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postFix: String = ""
) = joinToStringMethod(separator, prefix, postFix)