import kotlin.math.abs

fun main() {
    val (d, f) = readln().split(" ").map { it.toInt() }

    val day = 7 - (d - f) % 7
    println(day)
}