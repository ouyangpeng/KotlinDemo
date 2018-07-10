package kotlinTest

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name,postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("OuyangPeng", 1000)
    val client2 = Client("OuyangPeng", 1000)
    println(client1)
    println(client1 == client2)
}