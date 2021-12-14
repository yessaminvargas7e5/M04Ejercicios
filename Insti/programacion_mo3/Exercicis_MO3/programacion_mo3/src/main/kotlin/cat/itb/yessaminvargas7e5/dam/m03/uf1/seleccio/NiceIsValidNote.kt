package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val numEnter = scanner .nextInt()
    val billet1 = numEnter == 5
    val billet2 = numEnter == 10
    val billet3 = numEnter == 50
    val valid = billet1 || billet2 || billet3
    if (valid){
        println("bitllet vàlid")}
    else
        println("bitllet invàlid")

}


