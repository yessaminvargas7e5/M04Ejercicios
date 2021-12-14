package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*
import kotlin.math.min

fun main() {
    val scanner = Scanner(System.`in`)
    val numberList = listOf(scanner.nextInt())
    var minin = Int.MAX_VALUE
    for( i in 0..numberList.lastIndex){
        if (numberList[i]<minin){
            minin = numberList[i]
        }
        println(minin)
    }

}





