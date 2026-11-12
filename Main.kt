fun main() {
    val palavra = "Universidade"

    print("Consoantes: ")
    for (char in palavra) {
        // Converte para minúscula apenas para a verificação ficar mais simples
        if (char.lowercaseChar() in "aeiou") {
            continue
        }
        print(char)
    }
    println()
}