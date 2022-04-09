// Operadores Relacionais

fun main(args: Array<String>) {
    print("Digite o primeiro número: ")
    val n1: Int = readLine()!!.toIntOrNull()?:0

    print("digite o segundo número: ")
    val n2: Int = readLine()!!.toIntOrNull()?:0

    if (n1 > n2) {
        print("$n1 é maior que $n2")
    }
    else if (n1 < n2) {
        print("$n1 é menor que $n2")
    }
    else {
        print("$n1 é igual a $n2")
    }
}
