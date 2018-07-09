package kotlinTest

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class OYPButton : Clickable {
    override fun click() {
        println("I was clicked")
    }
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable")
}

class OYPDoubleImplementButton : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    //必须覆盖 showOff()方法，因为它集成了多个showOff()方法
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

// 这个类是开发的，其他类可以继承它
open class RichButton : Clickable {
    //这个方法默认是final的，你不可以在子类中覆盖它
    fun disable() {}
    //这个方法是open的，你可以在子类中覆盖它
    open fun animate() {}
    //覆盖了一个开发的函数，同事它也是open的
    override fun click() {}
}

// 这个类是抽象的，你不能创建它的实例
abstract class Animated{
    //这个方法是抽象的：它并没有一个实现，同时必须在子类中被覆盖
    abstract fun animate()
    //抽象类中的非抽象方法默认是不开放的，但是可以被标记为开放的
    open fun stopAnimating(){}
    //抽象类中的非抽象方法默认是不开放的
    fun animateTwice(){}
}

fun main(args: Array<String>) {
    val button = OYPDoubleImplementButton()
    button.showOff()
    button.setFocus(true)
    button.click()
}
