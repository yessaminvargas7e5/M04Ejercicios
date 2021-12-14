package cat.itb.yessaminvargas7e5.dam.m03.uf1.lists

import java.util.*

fun readIntList(scanner:Scanner):List<Int>{
    val enter = scanner.nextInt()
    return List(enter){scanner.nextInt()}
}


