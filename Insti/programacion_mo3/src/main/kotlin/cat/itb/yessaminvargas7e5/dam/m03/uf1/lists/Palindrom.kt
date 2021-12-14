package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val lletras= scanner.next()
    lletras[0]== lletras[lletras.lastIndex]
    lletras[1]== lletras[lletras.lastIndex-1]

        println("palíndrom")

}