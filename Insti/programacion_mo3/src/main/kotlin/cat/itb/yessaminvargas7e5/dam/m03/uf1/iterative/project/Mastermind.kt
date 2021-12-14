package cat.itb.yessaminvargas7e5.dam.m03.uf1.iterative.project

import java.util.*

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)
fun main() {

    val scanner = Scanner(System.`in`)
    println("Vols jugar en mode 1vs1 (1) o solitari (2)?")

    val jocMod = scanner.nextInt()
        if (jocMod==1){
            println("Introdueix la paraula secreta")

            val secretCombinacio = scanner.next()
            println("Comença el joc!")

            var intents = 0
            do { intents++
                println("Introdueix una combinació")

                val combinacioJoc = scanner.next()
                println(evaluateWord (secret = secretCombinacio, guess = combinacioJoc))
                if (secretCombinacio==combinacioJoc) {
                    println("Enhorabona! Has guanyat")
                    break
                }
            } while (intents<=12)
            if (intents>12) println("Fi del joc. Has perdut")
        }; if (jocMod==2){
            var i=1
            do {
                val letra1 = randomChar()
                val letra2 = randomChar()
                val letra3 = randomChar()
                val letra4 = randomChar()
                val eleccioLetra = "$letra1 $letra2 $letra3 $letra4"
                var intents=0
                do{
                    println("Introdueix una combinació")

                    val eleccio = scanner.next()
                    println(evaluateWord(secret = eleccioLetra, guess = eleccio))

                    if (eleccioLetra==eleccio){
                        println("Enhorabona! has guanyat")
                        break
                    }
                    intents++
                } while (intents<=12)
                if (intents>12) println("Fi del joc. Has perdut")
                i++
            } while (i==1)
        }
    }

    fun randomChar():Char{
        val allowedChars = 'A'..'F'
        return allowedChars.random()
    }
fun evaluateWord(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0
    if (secret[0] == guess[0]) rightPosition++
    if (secret[0] != guess[0]) wrongPosition++
    if (secret[1] == guess[1]) rightPosition++
    if (secret[1] != guess[1]) wrongPosition++
    if (secret[2] == guess[2]) rightPosition++
    if (secret[2] != guess[2]) wrongPosition++
    if (secret[3] == guess[3]) rightPosition++
    if (secret[3] != guess[3]) wrongPosition++
     return Evaluation(rightPosition, wrongPosition)
}