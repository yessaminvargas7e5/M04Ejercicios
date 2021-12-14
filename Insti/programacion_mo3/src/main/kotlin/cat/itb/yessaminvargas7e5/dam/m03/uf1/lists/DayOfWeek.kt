package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val enterDay = scanner.nextInt()
    val daysWeek = listOf("dilluns", "dimarts", "dimecres", "dijous","divendres", "dissabte", "diumenge")
    val day = daysWeek[enterDay]
    println(day)
}