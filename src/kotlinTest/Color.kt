package kotlinTest

enum class Color(val r: Int, var g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 265, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnmonic(color: Color) =
        when (color) {
            Color.YELLOW -> "YELLOW"
            Color.BLUE -> "Blue"
            else -> "ELSE"
        }

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.YELLOW -> "Warm"
    Color.GREEN -> "Neutral"
    Color.BLUE, Color.ORANGE -> "Cold"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.ORANGE) -> Color.BLUE
    else -> throw Exception("Dirty color")
}

fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
            (c1 == Color.YELLOW && c2 == Color.BLUE) || (c1 == Color.YELLOW && c2 == Color.BLUE) -> Color.GREEN
            else -> throw Exception("Dirty color")
        }