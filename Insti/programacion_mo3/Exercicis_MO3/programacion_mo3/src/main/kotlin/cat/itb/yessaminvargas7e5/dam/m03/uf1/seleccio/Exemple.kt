package cat.itb.yessaminvargas7e5.dam.m03.uf1.seleccio

import java.util.*

class Employee(val name: String, val surname: String, val age: Int)

fun areaOfCircle(radius: Double) = radius*radius*Math.PI


fun main() {
    val scanner = Scanner(System.`in`)
    val radius = scanner.nextDouble()
    val area = areaOfCircle(radius)
    println(area)


}