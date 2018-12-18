package kotlinTest.variable

fun main(args: Array<String>) {
    var a: Int = 56

    // 超出了Int的范围，报错
//    var bigValue : Int = 2999999999

    var bigValue2: Long = 2999999999

    println(a)
    println(bigValue2)

    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)

    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)

    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)

    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)

    //Int类型不支持null ,下面代码错误
//    var notNull : Int = null

    //Int? 相当于支持null值的Int类型
    var nullable: Int? = null

    //普通类型的整型变量会映射为java的基本类型
    var pm1: Int = 200
    var pm2: Int = 200
    println(pm1 === pm2)   // 基本类型比较，输出true

    //带？后缀的整型变量会映射成基本类型的包装类
    var obj1: Int? = 200
    var obj2: Int? = 200
    println(obj1 === obj2)  //引用类型比较，输出false
}