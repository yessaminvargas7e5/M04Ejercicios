package cat.itb.yessaminvargas7e5.dam.m03.uf1.iterative

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val baseEnter = scanner.nextInt()
    val exponentEnter = scanner.nextInt()
    repeat(exponentEnter){
        val multi = baseEnter * baseEnter
        println(multi)
    }
}

