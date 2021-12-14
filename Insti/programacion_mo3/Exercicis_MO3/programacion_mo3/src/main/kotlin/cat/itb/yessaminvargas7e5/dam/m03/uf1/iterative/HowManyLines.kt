package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var conterLine  = 0
    var lineTxt = scanner.nextLine()
    while (lineTxt!="END"){
        conterLine++
        lineTxt = scanner.nextLine()
    }
    println(conterLine)

}