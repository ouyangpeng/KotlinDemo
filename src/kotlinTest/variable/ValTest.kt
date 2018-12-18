package kotlinTest.variable

fun main(args:Array<String>){
    //声明常量时 没有显示指定类型，编译器会根据初始值确定该变量的类型
    val maxAge = 20
    //声明常量时 既显示指定类型，也指定初始值
    val eduName : String = "欧阳鹏"

    //常量是不可变变量，不能被重新赋值  下面的代码是错误的
    maxAge = 12

    //声明常量时 显示指定类型 不指定初始值
    //这是因为局部范围的常量，并不要求在定义时指定初始值，只要第一次使用之前指定初始值即可
    val herName : String
}