package kotlinTest

import java.io.Serializable


interface State : Serializable

interface OYPView {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}


class TestButton : OYPView {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State {}
}


class OuterClass {
    inner class InnerClass {
        //通过 this@OuterClass 来访问InnerClass类的Outer类
        fun getOuterRefrencen(): OuterClass = this@OuterClass
    }
}