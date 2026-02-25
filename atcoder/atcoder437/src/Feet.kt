fun main() {
    val (feet, inches) = readlnOrNull().toString().split(" ").map { it.toInt() }

    println(feet*12 + inches)
}