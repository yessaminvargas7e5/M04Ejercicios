package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numDays = scanner .nextInt()
    val Day = when(numDays){
        1-> "dilluns"
        2-> "dimarts"
        3-> "dimecres"
        4-> "dijous"
        5-> "divendres"
        6-> "dissabte"
        7-> "diumenge"
        else -> "error"
    }
    println(Day)
}