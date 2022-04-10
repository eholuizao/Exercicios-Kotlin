package exerciciosA21
import java.text.NumberFormat
import java.util.Currency


fun main(args: Array<String>) {
    val format = NumberFormat.getCurrencyInstance()
    format.maximumFractionDigits = 2
    format.currency = Currency.getInstance("BRL")

    println("""
        ========================
          CADASTRO ESTUDONAUTA
        ========================
    """.trimIndent())
    print("Nome do funcionário: ")
    var nome: String = readLine()!!.toString()

    print("Ano de nascimento: ")
    var nasc: String = readLine()!!.toString()

    print("Salário: ")
    var salario: Double = readLine()!!.toDoubleOrNull()?:0.0

    println("===========FICHA FUNCIONAL=============")
    println("Nome: \t\t\t $nome")
    println("Nascimento: \t $nasc")
    println("Salário \t\t ${format.format(salario)}")
    println("=======================================")
}