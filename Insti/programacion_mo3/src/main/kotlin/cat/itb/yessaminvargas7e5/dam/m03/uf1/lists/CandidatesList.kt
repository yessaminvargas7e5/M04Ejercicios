package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    scanner.nextLine()
    val candidates = List(size){
        scanner.nextLine()
    }
    var position = scanner.nextInt()
    while(position!=-1) {
        println(candidates[position-1])
        position = scanner.nextInt()
    }
}
