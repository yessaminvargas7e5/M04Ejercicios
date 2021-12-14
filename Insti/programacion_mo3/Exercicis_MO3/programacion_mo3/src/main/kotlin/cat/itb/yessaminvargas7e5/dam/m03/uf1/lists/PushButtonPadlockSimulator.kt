package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*
import java.util.Collections.list

fun main() {
    val scanner = Scanner(System.`in`)
    val list = MutableList(8){false}
    var button = scanner.nextInt()
    while (button!=-1){
        list[button] = !list[button]
        button = scanner.nextInt()
    }
    println(list)
}