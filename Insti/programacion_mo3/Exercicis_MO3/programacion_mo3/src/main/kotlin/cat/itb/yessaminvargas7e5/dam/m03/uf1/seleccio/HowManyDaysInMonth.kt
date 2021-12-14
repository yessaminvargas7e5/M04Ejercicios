package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val NomMes = scanner .nextInt()
    when(NomMes){
        1,3,6,7,8,10,12 -> println("31")
        2-> println("28")
        4,5,9,11-> println("30")


    }
}
