package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import cat.itb.yessaminvargas7e5.dam.m03.uf1.data.project.scanner


fun main() {
    val listEntera = List(10){ scanner.nextInt()}
    println(listEntera.reversed())
}