package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    /*val llistaNum = scanner.nextInt()
     */
    val list = MutableList(4){scanner.nextInt()}
    list[0]=7
    list[list.lastIndex]=9
    println(list)
}