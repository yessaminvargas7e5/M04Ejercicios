package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*
import kotlin.collections.mutableListOf as mutableListOf1

fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    val list = MutableList(50){0f}
    list [0] = 31.0f
    list [1] = 56.0f
    list [7] = 12.0f
    list [list.size -1] = 79.0f
    // o [list.lastIndex]
    println(list)
}