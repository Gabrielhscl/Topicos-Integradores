import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Valor A: ")
    val valorA = input.nextInt()

    print("Valor B: ")
    val valorB = input.nextInt()

    if (valorB%valorA == 0) {
        println("São Multiplos")
    } else {
        println("Não São Multiplos")
    }
}