package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var nomParticipant = ""
    var nombrePuntuacio = 0
    var nomGanador = ""
    var nombreGanador = 0

    do {
        nomParticipant = scanner.nextLine()
        if (nomParticipant != "END") {
            nombrePuntuacio = scanner.nextLine().toInt()
            if (nombrePuntuacio > nombreGanador) {
                nombreGanador = nombrePuntuacio
                nomGanador = nomParticipant
            }
        }
    } while (nomParticipant != "END")
    println("$nomGanador : $nombreGanador")

}