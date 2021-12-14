package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio.exam

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val diaSetmana = scanner.next()
    when(diaSetmana){
        "dilluns"-> println("Compra llums")
        "dimarts"-> println("Compra naps")
        "dimecres"-> println("Compra nespres")
        "dijous"-> println("Compra nous")
        "divendres"-> println("Faves tendres")
        "dissabte"-> println("Tot s'ho gasta")
        "diumenge"-> println("Tot s'ho menja")
        else -> println("ERROR")
    }

}