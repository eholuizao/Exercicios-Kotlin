fun main(args: Array<String>) {
    var nome: String
    // nome = null ERRO!

    //Operador safe call "?" permite uma variável ser nula.
    var profissao: String?
    profissao = null //OK!

    //Operador elvis "?:" permite atribuir uma variável com safe call em outra que não tenha

    var safeCall: String? = null
    var noSafeCall: String = safeCall?:"nulo"
    println(noSafeCall)

    //Operador null check
    var withSF: String? = null
    var withoutSF: String = ""

    try {
        withoutSF = withSF!!
    } catch (e: NullPointerException) {
        println("Deu problema, mas estou resolvendo...")
        withoutSF = "A variável é nula."
    } finally {
        println(withSF)
        println(withoutSF)
    }
}