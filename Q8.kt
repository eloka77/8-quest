fun main() {
    val senhaCorreta = "kotlin123"

    for (tentativa in 1..5) {
        print("Tentativa $tentativa/5 - Digite a senha: ")
        val senhaDigitada = readln()

        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido!")
            break
        } else {
            println("Senha incorreta.")

            if (tentativa == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }
}