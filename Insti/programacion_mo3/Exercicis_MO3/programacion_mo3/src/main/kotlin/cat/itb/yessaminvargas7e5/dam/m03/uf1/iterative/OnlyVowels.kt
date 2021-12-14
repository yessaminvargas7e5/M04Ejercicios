package cat.itb.yessaminvargas7e5.dam.m03.uf1.iterative

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numLet = scanner.nextInt()

    repeat(numLet) {
        val letra = scanner.next()
        when (letra) {
            "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" -> println(letra)
        }
    }
}