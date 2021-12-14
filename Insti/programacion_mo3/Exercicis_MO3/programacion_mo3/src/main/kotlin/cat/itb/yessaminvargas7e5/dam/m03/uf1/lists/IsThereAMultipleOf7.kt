package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numberList =
        listOf(4,8,9,40,54,84,40,6,84,1,1,68,84,68,4,840,684,25,40,98,54,687,31,4894,468,46,84687,894,40,846,1681,618,161,846,84687,6,848)

    val anyNegative = numberList.any{ it / 7 ==0}
    println(anyNegative)
}