package exerciciosA21

fun main(args: Array<String>) {
    println("""
        =======================
          ANALISANDO MÊS ATUAL
        =======================
    """.trimIndent())

    print("Qual valor você quer sacar? R$")
    var valor: Double = readLine()!!.toDoubleOrNull()?:0.0

    var ced50 = (valor / 50).toInt()
    valor %= 50

    var ced10 = (valor / 10).toInt()
    valor %= 10

    var ced2 = (valor / 2).toInt()
    valor %= 2

    var ced1 = (valor).toInt()

    println("=========== RESULTADOS =============")
    println("R$50,00 \t= $ced50 cédula(s)")
    println("R$10,00 \t= $ced10 cédula(s)")
    println("R$2,00  \t= $ced2 cédula(s)")
    println("R$1,00  \t= $ced1 moeda(s)")
    println("====================================")
}