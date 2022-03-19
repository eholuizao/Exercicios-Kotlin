fun main(args: Array<String>) {
    /*
    print("Qual é o seu nome")
    val nome: String = readLine()!!

    print("Quantos anos você tem?")
    val idade: Int = readLine()!!.toIntOrNull()?:0

    print("$nome tem $idade anos.")
     */

    print("Digite um valor: ")
    val n1: Int = readLine()!!.toIntOrNull()?:0

    print("Digite outro valor: ")
    val n2: Int = readLine()!!.toIntOrNull()?:0

    val s: Int = n1 + n2
    println("A soma entre $n1 e $n2 é igual a $s")
}