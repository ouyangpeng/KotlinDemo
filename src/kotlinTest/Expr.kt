package kotlinTest

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("不知道的类型，转换失败")
}

fun evalIfElse(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval(e.right) + eval(e.left)
        } else {
            throw IllegalArgumentException("不知道的类型，转换失败")
        }

fun evalWhen(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> evalWhen(e.right) + eval(e.left)
            else -> throw IllegalArgumentException("不知道的类型，转换失败")
        }

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num : ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum : $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("不知道的类型，转换失败")
        }

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    println(evalIfElse(Sum(Sum(Num(1), Num(2)), Num(3))))
    println(evalWhen(Sum(Sum(Num(1), Num(2)), Num(7))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(7))))
}