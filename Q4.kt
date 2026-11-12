fun main() {
    var saldo = 1000.0
    val valorSaque = 150.0

    while (true) {
        if (saldo < valorSaque) {
            println("Saldo Insuficiente. Saldo atual: R$ $saldo")
            break
        }
        saldo -= valorSaque
        println("Saque de R$ $valorSaque realizado. Saldo restante: R$ $saldo")
    }
}