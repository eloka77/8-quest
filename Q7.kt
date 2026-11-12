fun main() {
    for (numero in 1..50) {
        if (numero % 10 == 7) {
            continue
        }
        print("$numero ")
    }
    println()
}