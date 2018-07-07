package kotlinTest


fun main(args: Array<String>) {
    val strings: List<String> = listOf("first", "second", "fourteeth")
    println(strings.last())

    val numbers: Collection<Int> = setOf(1, 13, 2)
    println(numbers.min())


    //展开操作符解压（unpack）数组内容
    val list = listOf("first: ", *args)
    println(list)

    //infix call 中缀调用
    val map = mapOf<Int, String>(1 to "one", 7 to "seven", 53 to "fifty-three")
    val map2 = mapOf<Int, String>(1.to("one"), 7.to("seven"), 53.to("fifty-three"))
    println(map)
    println(map2)
}
