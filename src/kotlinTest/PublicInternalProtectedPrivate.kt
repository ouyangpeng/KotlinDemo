package kotlinTest

internal open class TalaktiveButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}


//fun TalaktiveButton.giveSpeech() { //1.错误：'public'成员暴露了它的'internal'接收器类型TalaktiveButton
//    yell()                      //2.错误：无法访问 'yell'：它在'TalaktiveButton'内部是'private'
//    whisper() //3.错误：无法访问 'whisper'：它在'TalaktiveButton'内部是'protected'
//}