package cat.itb.yessaminvargas7e5.dam.m03.uf1.data.project

import java.time.Year
import java.util.*

val scanner = Scanner(System.`in`).useLocale(Locale.UK)
fun main() {
    welcome("TrainingAssistant") // change it as you need
    ageCalculator()
    imcCalculator()
    trainingSchedule()
}

fun welcome(assistantName: String) {
    println("Hello! My name is TrainingAssistant.")
    println("Please, Tell me your name.")
    val nom = scanner .nextLine()
    println("What a great name you have, $nom")

}
fun ageCalculator() {
    println("Please, tell me which year you were born.")
    val anyNaciment = scanner .nextInt()
    val age = Year.now().value - anyNaciment
    println("You are between $age years old. That's a good age for practicing sport")
    /* val age2 = age -1
    seria ageMaxima y ageMini
     */
    //val currentYear = Year.now().value
}

fun imcCalculator() {
    println("Let's check some of your parameters")
    println("Tell me your weight in kg")
    val weightUsuari = scanner.nextInt()
    println("Tell me your height in m")
    val heightUsuari = scanner.nextDouble()
    val imc = weightUsuari / (heightUsuari * 2)
    println("Checking insufficient weight .... ${imc < 18.5}")
    println("Checking normal weight .... ${imc in 19.16..24.9}")
    println("Checking overweight .... ${imc in 25.0..50.0}")
    println("Checking obesity weight .... ${imc >50}")

}
fun trainingSchedule() {
    println("I'll tell you your training plan")
    println("How many hours would you like to train?")
    val numHours = scanner.nextInt()
    println("How many days can you train?")
    val numDays = scanner.nextInt()
    val training = numHours / numDays
    val trainingRoutine = numHours % numDays
    val hoursRoutine = training + 1
    val daysRoutine = numDays - trainingRoutine
    println("Your routine sport could be:")
    println("$trainingRoutine days $hoursRoutine hours")
    println("$daysRoutine days $training hours")

}




