package kotlinTest

class DelegatingCollectionWithOutBy<T> : Collection<T> {
    private val innerList = arrayListOf<T>()
    override val size: Int
        get() {
            return innerList.size
        }

    override fun isEmpty(): Boolean {
        return innerList.isEmpty()
    }

    override fun contains(element: T): Boolean {
        return innerList.contains(element)
    }

    override fun iterator(): Iterator<T> {
        return innerList.iterator()
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return innerList.containsAll(elements)
    }
}

//使用关键字 by 把接口的实现委托给另外一个对象
class DelegatingCollection<T>(
        innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList {}


class CountingSet<T>(
        val innerSet:MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet{ // 使用关键字 by 委托MutableCollection的实现给innerSet
    var objectsAdd = 0

    override fun add(element: T): Boolean {
        objectsAdd ++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdd += elements.size
        return innerSet.addAll(elements)
    }
}

fun main(args: Array<String>) {
    val countingSet = CountingSet<Int>()
    countingSet.addAll(listOf(1,1,2))
    println("${countingSet.objectsAdd} objects were added , ${countingSet.size} remain")
}