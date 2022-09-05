import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    val cardapio = listOf(
        listOf("Cachorro Quente", 4.00),
        listOf("X-Salada", 4.50),
        listOf("X-Bacon", 5.00),
        listOf("Torrada Simples", 2.00),
        listOf("Refrigerante", 1.50),
    )

    println("Código, Especificação, Preço")
    for(i in cardapio.indices){
        println("${i+1} ${cardapio[i]}")
    }
    
    print("Digite o Código do Prato: ")
    val codigo = input.nextInt() - 1
    print("Digite Quantos serão: ")
    val quantidadeDeItens = input.nextInt()

    var item = cardapio[codigo].last().toString().toDouble()
    var total = item * quantidadeDeItens

    println("Total: R$ ${total}")


}
