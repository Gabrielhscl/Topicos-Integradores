import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Valor A: ")
    val valorA = input.nextDouble()

    print("Valor B: ")
    val valorB = input.nextDouble()

    print("Valor C: ")
    val valorC = input.nextDouble()

    val area = (valorA+valorB)*valorC/2
    val perimetro = valorA + valorB + valorC

    if ((valorA < (valorB + valorC)) && (valorB < (valorA + valorC)) && (valorC < (valorA + valorB))) {
        println("Perimetro: $perimetro")
    } else {
        println("Area = $area")
    }
}