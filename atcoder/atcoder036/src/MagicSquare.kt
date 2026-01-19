fun main() {
    val n = readln().toInt()
    val magicSquare = buildMagicSquare(n)
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${magicSquare[i][j]}${if (j < n - 1) " " else ""}")
        }
        println()
    }
}

data class Coord(var x: Int, var y: Int)

fun buildMagicSquare(n: Int): Array<IntArray> {
    val arr = Array(n) { IntArray(n) {0} }
    val nextCell = Coord(0, (n - 1)/2)
    arr[nextCell.x][nextCell.y] = 1
    var lastValue = 1
    for (i in 0..<n*n - 1) {
        var nextX = (nextCell.x - 1).mod(n)
        var nextY = (nextCell.y + 1).mod(n)
        if (arr[nextX][nextY] == 0) {
            arr[nextX][nextY] = ++lastValue
        } else {
            nextX = (nextCell.x + 1).mod(n)
            nextY = nextCell.y
            arr[nextX][nextY] = ++lastValue
        }
        nextCell.x = nextX
        nextCell.y = nextY
    }
    return arr
}