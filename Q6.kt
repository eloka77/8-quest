fun main() {
    while (true) {
        print("Escolha uma opção (1, 2, 3 ou 0): ")
        val opcao = readln().toIntOrNull()

        if (opcao == 1 || opcao == 2) {
            println("Processando...")
        } else if (opcao == 3) {
            println("Módulo em manutenção")
            continue
        } else if (opcao == 0) {
            println("Encerrando programa...")
            break
        } else {
            println("Opção inválida, tente novamente.")
        }
    }
}