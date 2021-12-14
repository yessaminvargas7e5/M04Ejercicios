package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.time.Year
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val anyTraspàs = scanner .nextInt()
    if (anyTraspàs%4==0){
        if (anyTraspàs%100==0)
            println("és any de traspàs")
    }
    else println("no és any de traspàs")

}