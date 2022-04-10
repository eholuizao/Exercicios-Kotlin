package exerciciosA21
import java.time.LocalDateTime
import kotlin.math.ceil

fun main(args: Array<String>) {
    println("""
        =======================
          ANALISANDO MÊS ATUAL
        =======================
    """.trimIndent())

    var dataAtual = LocalDateTime.now()
    var trimestre = ceil(dataAtual.monthValue /3.0).toInt()
    var semestre = ceil(dataAtual.monthValue/6.0).toInt()

    println("=========== RESULTADOS =============")
    println("Estamos no mês ${dataAtual.monthValue} de ${dataAtual.year}")
    println("Esse mês está no ${semestre}° semestre")
    println("E está no ${trimestre}° trimestre")
    println("====================================")
}