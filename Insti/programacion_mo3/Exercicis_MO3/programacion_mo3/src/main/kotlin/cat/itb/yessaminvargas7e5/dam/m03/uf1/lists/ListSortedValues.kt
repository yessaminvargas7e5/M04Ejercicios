package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val  scanner = Scanner(System.`in`)
    val enter = scanner.nextInt()
    val listEnter = List(enter){scanner.nextInt()}
    val num = listEnter[1]
    val num2 = listEnter[2]

    //for (i in 0..5)
        if (num != num2)
            //break
            println("desordenats")
    else println("ordenats")


    //listEnter[3]!= 25

}
/*
for(i in 0..until "".lastIndex){
if list[i]>list[i+1]){
sorted= false
}
 */