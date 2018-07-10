package kotlinTest

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name,postalCode=$postalCode)"
    override fun equals(other: Any?): Boolean { // Any 类似于 java.lang.Object 它是Kotlin中所有类的超类
        if (other == null || other !is Client) //检查other变量是否为Client
            return false
        return name == other.name && postalCode == other.postalCode //检查相应的属性是否相等
    }
}

fun main(args: Array<String>) {
    val client1 = Client("OuyangPeng", 1000)
    val client2 = Client("OuyangPeng", 1000)
    println(client1)
    println(client1 == client2)
}