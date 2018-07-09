package kotlinTest

//把一个基类标记为密封类
sealed class SealedExpr {
    //列出所有可能的子类作为嵌套类
    class Num(val value: Int) : SealedExpr()

    class Sum(val left: Expr, val right: Expr) : SealedExpr()
}

fun eval(e: SealedExpr): Int =
        when (e) {
            is SealedExpr.Num -> e.value
            is SealedExpr.Sum -> eval(e.right) + eval(e.left)
        }