package kotlinTest

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)
    print(person.isMarried)
    println(person.max(1, 3))

    val rectangle = Rectangle(4, 4)
    println(rectangle.isSquare)
    println(createRandomRectangle().isSquare)

    println(Color.BLUE.rgb())

    println(getMnmonic(Color.RED))

    println(getWarmth(Color.RED))

    println(mix(Color.RED, Color.YELLOW))
    println(mixOptimized(Color.RED, Color.YELLOW))
//        println(mixOptimized(Color.RED, Color.BLUE));


    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}