package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    val gradeExamen = scanner .nextDouble()
    if (gradeExamen <0 && gradeExamen>10){
        println("Nota Invalida")
    } else if (gradeExamen <5){
        println("Suspès")
    } else if (gradeExamen <6){
        println("Suficien")
    } else if (gradeExamen <7){
        println("Bé")
    } else if (gradeExamen <8){
        println("Notable")
    } else if (gradeExamen >9){
        println("Excelent")
    }

}