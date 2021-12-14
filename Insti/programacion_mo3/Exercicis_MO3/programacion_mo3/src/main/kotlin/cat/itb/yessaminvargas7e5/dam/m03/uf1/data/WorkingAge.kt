import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val edat = scanner .nextInt()
    val legal= edat in 16..65
    println(legal)
}