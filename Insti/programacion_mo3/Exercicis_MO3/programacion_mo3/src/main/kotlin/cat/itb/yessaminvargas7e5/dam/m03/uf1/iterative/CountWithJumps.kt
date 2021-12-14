package cat.itb.yessaminvargas7e5.dam.m03.uf1.iterative

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numNormal = scanner.nextInt()
    val numSalta = scanner .nextInt()
    for (i in 1..numNormal step numSalta) println(i)
}