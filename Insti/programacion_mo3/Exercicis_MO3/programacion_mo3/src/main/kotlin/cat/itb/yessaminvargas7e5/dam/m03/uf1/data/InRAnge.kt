import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val range1Star = scanner.nextInt()
    val range1End = scanner.nextInt()
    val range2Star = scanner.nextInt()
    val range2End = scanner.nextInt()
    val valueCheck = scanner.nextInt()
    val rangevalue1 = valueCheck in range1Star..range1End
    val rangevalue2 = valueCheck in range2Star..range2End
    println(rangevalue1 && rangevalue2)
}