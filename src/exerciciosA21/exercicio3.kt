package exerciciosA21

fun main(args: Array<String>) {
    println("""
        ========================
            NOTA ESTUDONAUTA
        ========================
    """.trimIndent())

    print("Nota 1: ")
    val nota1: Float = readLine()!!.toFloatOrNull()?:0.0f

    print("Nota 2: ")
    val nota2: Float = readLine()!!.toFloatOrNull()?:0.0f

    var media: Float = (nota1 + nota2) / 2

    println("=========== RESULTADOS =============")
    println("As notas do aluno foram $nota1 e $nota2")
    println("A média final foi $media")
    println("====================================")
}