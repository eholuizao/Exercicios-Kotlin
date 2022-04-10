package exerciciosA21
import kotlin.math.pow

fun main(args: Array<String>) {
    println("""
        ========================
                POTÊNCIA
        ========================
    """.trimIndent())

    print("Base: ")
    val base: Int = readLine()!!.toIntOrNull()?:0

    print("Expoente: ")
    var expoente: Int = readLine()!!.toIntOrNull()?:0

    println("=========== RESULTADOS =============")
    println("Calculando $base elevado a $expoente")
    println("O resultado é ${base.toFloat().pow(expoente)}")
    println("====================================")
}