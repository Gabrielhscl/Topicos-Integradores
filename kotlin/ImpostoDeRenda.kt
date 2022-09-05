import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    val salario: Double = input.nextDouble()

    val imposto = percentualImposto(salario)

    println("R$ ${"%.2f".format(imposto)}")

}

fun percentualImposto(salario: Double): Any {

    return if (salario <= 2000) {
        "Isento"
    } else if (salario <= 3000) {
        (salario - 2000) * 0.08
    } else if (salario <= 4500){
        1000 * 0.08 + (salario - 3000) * 0.18
    } else {
        1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28
    }
}