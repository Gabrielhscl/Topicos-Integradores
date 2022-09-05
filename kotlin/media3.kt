import java.util.Scanner

fun main() {
    val input = Scanner(System. `in`)

    print("Nota1: ")
    val numberOne = input.nextDouble()
    print("Nota2: ")
    val numberTwo = input.nextDouble()
    print("Nota3: ")
    val numberThree = input.nextDouble()
    print("Nota4: ")
    val numberFor = input.nextDouble()

    val peso1 = 2
    val peso2 = 3
    val peso3 = 4
    val peso4 = 1

    val media = (peso1 * numberOne + peso2 * numberTwo + peso3 * numberThree + peso4 * numberFor) /
            (peso1 + peso2 + peso3 + peso4)

    println("Media: ${"%.1f".format(media)}")

    result(media)

}

fun result(media: Double){
    val input = Scanner(System. `in`)
    if (media >= 7) {
        println("Aluno Aprovado.")
    } else if (media < 5) {
        println("Aluno Reprovado.")
    } else {
        println("Aluno em exame.")
        print("Nota do Exame: ")
        val notaExame = input.nextDouble()
        val mediaFinal = (media + notaExame) / 2
        if (mediaFinal >= 5) {
            println("Aluno Aprovado.")
        } else {
            println("Aluno Reprovado.")
        }
        println("Media Final: ${"%.1f".format(mediaFinal)}")
    }
}