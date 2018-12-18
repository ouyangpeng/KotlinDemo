package kotlinTest.variable
fun main(args:Array<String>){
    //同一行内书写多条独立的语句
    var name = "oyp";println(name)

    //单独一行只有一条语句，Kotlin可以允许不以分号结尾
    var str = "test"
    println(str)

    //表达式可以跨多行
    str +=
            ".org"
    println(str)

    //调用方法时可以跨多行
    var hasOy = str
            .startsWith("te")
    println(hasOy)

    // 访问属性时可以跨多行
    var len = str
            .length
    println(len)

}
