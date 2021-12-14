package cat.itb.yessaminvargas7e5.dam.m03.uf1.iterative

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numMulti =  scanner.nextInt()
    for ( i in 1..9 ) {
        val result = i * numMulti
        println("$i * $numMulti = $result")

    }
}

