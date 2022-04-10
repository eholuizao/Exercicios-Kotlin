package exerciciosA21
import java.time.LocalDateTime
import kotlin.math.abs

fun main(args: Array<String>) {
    val dh = LocalDateTime.now()
    print("Vou conseguir descobrir a sua idade")

    print("Em que ano você nasceu? ")
    val nasc: Int = readLine()!!.toInt()

    println("=========== RESULTADOS =============")
    println("Você nasceu em $nasc")
    println("Atualmente, estamos em ${dh.year}")
    println("Completa ${dh.year - nasc} nesse ano.")
    println("====================================")
}