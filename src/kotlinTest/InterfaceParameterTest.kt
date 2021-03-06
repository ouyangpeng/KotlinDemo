package kotlinTest

interface User2 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User2

class SubscribingUser(val email: String) : User2 {
    override val nickname: String
        get() = email.substringBefore('@') //自定义getter属性初始化器
}

class FaceBookUser(val accountId: Int) : User2 {
    override val nickname = getFaceBookName(accountId)

    private fun getFaceBookName(accountId: Int): String =
            //通过id 去查找对应的 nickName
            when (accountId) {
                1 -> "Bob"
                2 -> "Jobs"
                3 -> "Kobe"
                else -> "TestNickName"
            }
}


class User3(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was change for $name :
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}


class LengthCounter {
    var counter: Int = 0
        private set //你无法在类的外部改变这个属性

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
    println(FaceBookUser(3).nickname)

    val user3 = User3("Alice")
    user3.address = "广东省深圳市"


    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
//    lengthCounter.counter = 3 // setter方法是private 不可以使用
}