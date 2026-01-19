//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val n = readln().toInt()
    var s = readln()
    while (s.length < n) {
        s = "o$s"
    }

    println(s)
}