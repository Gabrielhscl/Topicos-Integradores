import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    val valor = input.nextInt()

    for (i in 1..valor step 2)
        println(i)
}