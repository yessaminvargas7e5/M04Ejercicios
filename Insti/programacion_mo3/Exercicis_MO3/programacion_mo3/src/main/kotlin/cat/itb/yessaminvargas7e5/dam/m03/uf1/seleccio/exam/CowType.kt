package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio.exam

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var edatAnimal = scanner.nextInt()
    var sexeAnimal = scanner.nextInt()
    var capat = scanner.nextInt()
    if (edatAnimal <= 2){
        println("vedell")}
        else
        if (sexeAnimal==1){ println("Toro")
        } else if (sexeAnimal==2){ println("Vaca")}
        else
            if (capat == 1){
                println("Toro")
            } else if (capat == 2){
                println("bou")
            }

}
