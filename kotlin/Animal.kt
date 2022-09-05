import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    var animal = input.nextLine().uppercase()

    if (animal == "VERTEBRADO"){
        animal = input.nextLine().uppercase()
        if (animal == "AVE"){
            animal = input.nextLine().uppercase()
            if (animal == "CARNIVORO"){
                println("Aguia")
            } else if (animal == "ONIVORO") {
                println("Pomba")
            }
        } else if (animal == "MAMIFERO") {
            animal = input.nextLine().uppercase()
            if (animal == "ONIVORO"){
                println("Homem")
            } else if (animal == "HERBIVORO") {
                println("Vaca")
            }
        }


    } else if (animal == "INVERTEBRADO"){
        animal = input.nextLine().uppercase()
        if (animal == "INSETO"){
            animal = input.nextLine().uppercase()
            if (animal == "HEMATOFAGO"){
                println("Pulga")
            } else if (animal == "HERBIVORO") {
                println("Largata")
            }
        } else if (animal == "ANELIDEO") {
            animal = input.nextLine().uppercase()
            if (animal == "HEMATOFAGO"){
                println("Sanguessuga")
            } else if (animal == "ONIVORO") {
                println("Minhoca")
            }
        }
    }
}