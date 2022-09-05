import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()

    val percentual = reajuste(salario)
    val reajusteGanho = (percentual / 100.00) * salario

    val novoSalario = salario+reajusteGanho

    println("Novo Salário: ${"%.2f".format(novoSalario)}")
    println("Reajuste Ganho: ${"%.2f".format(reajusteGanho)}")
    println("Em Percentual: $percentual%")

}

fun reajuste(salario: Double): Int {

    return if (salario <= 400){
        15
    } else if (salario <= 800) {
        12
    } else if (salario <= 1200) {
        10
    } else if (salario <= 2000) {
        7
    } else {
        4
    }

}