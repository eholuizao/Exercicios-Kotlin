import java.time.LocalDateTime

fun main(args: Array<String>) {
    val dh = LocalDateTime.now()
    println("Dia atual: ${dh.dayOfMonth}")
    println("Mês: ${dh.month}")
    println("Mês atual: ${dh.monthValue}")
    println("Ano atual: ${dh.year}")

    println("${dh.hour}:${dh.minute}:${dh.second}")
}