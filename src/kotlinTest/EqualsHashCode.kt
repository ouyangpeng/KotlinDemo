package kotlinTest

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name,postalCode=$postalCode)"
    override fun equals(other: Any?): Boolean { // Any 类似于 java.lang.Object 它是Kotlin中所有类的超类
        if (other == null || other !is Client) //检查other变量是否为Client  Kotlin中的is是Java的instanceOf的对应物
            return false
        return name == other.name && postalCode == other.postalCode //检查相应的属性是否相等
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client(name, postalCode)
}

fun main(args: Array<String>) {
    val client1 = Client("OuyangPeng", 1000)
    val client2 = Client("OuyangPeng", 1000)
    println(client1)
    println(client1 == client2)

    val processed = setOf<Client>(Client("Alice", 343562))
    println(processed.contains(Client("Alice", 343562)))

    val bob = Client("Bob",9799797)
    println(bob.copy(postalCode = 123456))
}