fun main() {
    val alvo = 29
    var ehPrimo = true

    for (i in 2 until alvo) {
        if (alvo % i == 0) {
            ehPrimo = false
            break
        }
    }

    if (ehPrimo) {
        println("O número $alvo é primo.")
    } else {
        println("O número $alvo não é primo.")
    }
}