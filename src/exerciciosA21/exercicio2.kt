package exerciciosA21

fun main(args: Array<String>) {
    println("""
        ========================
              DOIS VALORES
        ========================
    """.trimIndent())

    print("Digite o primeiro número: ")
    var num1: Int = readLine()!!.toIntOrNull()?:0

    print("Digite o segundo número: ")
    var num2: Int = readLine()!!.toIntOrNull()?:0

    println("=========== RESULTADOS =============")
    println("Soma: \t\t\t ${num1 + num2}")
    println("Subtração: \t\t ${num1 - num2}")
    println("Multiplicação \t ${num1 * num2}")
    println("Divisão: \t\t ${num1 / num2.toFloat()}")
    println("Módulo: \t\t ${num1 % num2}")
    println("====================================")
}