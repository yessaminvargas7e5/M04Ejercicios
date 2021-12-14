package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val listBox = mutableListOf<Int>(2, 0, 0, 1, 1, 5, 0, 0, 0, 1, 0, 0)
    var button = scanner.nextInt()
    while (button!=-1){
        listBox[button] = listBox[button]
        button = scanner.nextInt()
    }

    println(listBox)
}