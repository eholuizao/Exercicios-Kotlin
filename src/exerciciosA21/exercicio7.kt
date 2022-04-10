package exerciciosA21
import kotlin.math.abs

fun main(args: Array<String>) {
    println("""
        =======================
            TENTE ADIVINHAR
        =======================
    """.trimIndent())

    println("Vou \"pensar\" em um número entre 0..5 ")
    var randomNum = (0..5).random()

    print("Seu palpite: ")
    var palpite: Int = readLine()!!.toIntOrNull()?:0

    println("=========== RESULTADOS =============")
    println("Você disse que seria o valor $palpite")
    println("Eu pensei no número $randomNum")
    println("A diferença foi de ${abs(randomNum - palpite)}")
    println("====================================")
}