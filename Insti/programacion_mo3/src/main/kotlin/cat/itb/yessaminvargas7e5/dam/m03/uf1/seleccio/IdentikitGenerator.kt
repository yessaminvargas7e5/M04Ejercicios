package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val tipusCabells = scanner .next()
    val tipusUlls = scanner .next()
    val tipusNas = scanner .next()
    val tipusBoca = scanner .next()
    val cabellsDraw = when(tipusCabells) {
       "arrissats"-> "@@@@@"
       "llisos"-> "VVVVV"
       else->"XXXXX"
    }
    val ullsDraw = when(tipusUlls){
        "aclucats"->".-.-."
        "rodons"->".o-o."
        else->".*-*."
    }
    val nasDraw = when(tipusNas){
        "aixafat"->"..0.."
        "arromangat"->"..C.."
        else->"..V.."
    }
    val bocaDraw = when(tipusBoca){
        "normal"->".===."
        "bigoti"->".~~~."
        else->".www."
    }
}