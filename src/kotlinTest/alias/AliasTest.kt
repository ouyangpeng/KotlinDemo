package kotlinTest.alias

class A {
    inner class Inner
}

class B {
    inner class Inner
}

typealias AInner = A.Inner
typealias BInner = B.Inner

fun main(args:Array<String>){
    var a1 : AInner = A().AInner()
    var a2 : AInner = A().Inner()

    var b = B().BInner()
}


