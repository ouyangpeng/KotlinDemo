package kotlinTest.variable

fun main(args: Array<String>) {
    /**
     * 1、所有Byte、Short类型 将被提升为Int类型
     * 2、整个算数表达式的数据类型自动提升 与 表达式中最高等级操作数同样的类型
     *
     *  Byte-->Short-->Int-->Long-->Float-->Double
     */
    var sValue: Short = 5
    // 表达式中的sValue将自动提升为Int类型，则右边表达式类型为Int
    // 将Int类型赋值给Short类型，发送错误  Error:(7, 14) Kotlin: Type mismatch: inferred type is Int but Short was expected
    //    sValue = sValue - 2

}