package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio.exam

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val radarVelocitat = scanner.nextInt()
    val velocitatSuperior = 120
    val velocitatMaxima = 20
 if(radarVelocitat>velocitatSuperior){
     println("Multa greu")
 }else if(radarVelocitat<velocitatMaxima){
     println("Multa Lleu")
 }
    else ("Correcte")

}