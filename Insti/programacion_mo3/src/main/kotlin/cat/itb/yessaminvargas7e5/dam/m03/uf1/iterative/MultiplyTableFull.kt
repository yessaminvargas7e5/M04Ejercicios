package cat.itb.yessaminvargas7e5.dam.m03.uf1.iterative



fun main() {
    for (i in 1..9) {
        for (j in 1..9) {
            val multi = i * j
            if (multi<10) print(" ")
            print("$multi ")
        }
        println()
    }
}

