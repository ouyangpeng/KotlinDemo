package kotlinTest.variable

public fun main(args:Array<String>){
    //声明变量时 显示指定类型
    var b:Int

    //声明变量时 指定初始值，编译器会根据初始值确定该变量的类型为"String"
    var name = "ouyangpeng"

    // b 的类型为 Int,赋值正确
    b = 29

    // name 的类型为 String,赋值正确
    name = "csdn"
    // name 的类型为 String，但是12 为Int，赋值错误
    name = 12

    //声明变量时 既显示指定类型，也指定初始值
    //显示指定类型 与 初始值类型 一致，声明变量正确
    var age : Int = 25
    //age 的类型为 Int,赋值正确
    age = 12

    //声明变量时 既显示指定类型，也指定初始值
    //显示指定类型 与 初始值类型 不一致，声明变量错误
    var sum : String = 250

    // 使用val声明的变量是不可变变量，不能被重新赋值
    val blog = "https://blog.csdn.net/ouyang_peng/"
    blog = "Test"
}