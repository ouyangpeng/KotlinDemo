package kotlinTest

fun String.lastChar(): Char = this.get(this.length - 1)
fun String.lastChar2(): Char = get(length - 1) //this引用是隐式的

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".lastChar2())

    val view: View = Button()
    view.click()
    //扩展函数被静态的方式进行解析
    view.showOff()
}

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun View.showOff() = println("I am a view!")
fun Button.showOff() = println("I am a button!")


