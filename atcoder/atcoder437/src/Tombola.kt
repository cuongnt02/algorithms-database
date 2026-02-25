fun main() {
    val (h, w, n) = readlnOrNull().toString().split(" ").map { it.toInt() }

    val grid = Array(h) {
        readln().split(" ").map { it.toInt() }.toIntArray()
    }

    val callout = Array(n) {
        readln().trim().toInt()
    }
    val sum = mutableListOf<Int>()
    for (i in 0 until h) {
        sum += grid[i].count { callout.contains(it) }
    }
    print(sum.max())


}