package exerciciosA21
import java.text.NumberFormat
import java.util.Currency

fun main(args: Array<String>) {
    val dinFormat = NumberFormat.getCurrencyInstance()
    dinFormat.maximumFractionDigits = 2
    dinFormat.currency = Currency.getInstance("BRL")

    println("""
        =======================
           REAJUSTE SALARIAL
        =======================
    """.trimIndent())

    print("Salario: ")
    var salario: Float = readLine()!!.toFloatOrNull()?:0.0f

    print("Reajuste(%): ")
    var reajuste: Float = readLine()!!.toFloatOrNull()?:0.0f

    var novoSalario: Float = salario + (salario * (reajuste/100))

    println("=========== RESULTADOS =============")
    println("O salário anterior era: \t $salario")
    println("O aumento será de: \t\t\t $reajuste%")
    println("E passará a ganhar: \t\t ${dinFormat.format(novoSalario)}")
    println("====================================")
}