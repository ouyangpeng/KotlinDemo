package kotlinTest

//class OYPUser(val nickname: String)

class OYPUser constructor(_nickname: String) { //带有一个参数的主构造器
    val nickname: String

    //初始化块
    init {
        nickname = _nickname
    }
}

class OYPUser2 constructor(_nickname: String) {
    //带有一个参数的主构造器
    // 属性被参数初始化
    val nickname = _nickname
}

//为构造函数参数提供默认值
class OYPUser3(val nickname: String, val isSubscribed: Boolean = true)


open class OYPUSer4(val nickname: String) {}

class TwitterUser(nickname: String) : OYPUSer4(nickname) {}


//这个类有一个私有构造函数
class Secretive private constructor() {}

class Secretive2 {
    private constructor()
}

fun main(args: Array<String>) {
    val alice = OYPUser3("Alice")
    println(alice.isSubscribed)

    val bob = OYPUser3("Bob", isSubscribed = false)
    println(bob.isSubscribed)
}