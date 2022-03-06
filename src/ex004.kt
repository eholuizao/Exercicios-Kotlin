fun main(args: Array<String>) {
    // Interpolação de Strings

    val nome = "Luizão"
    println("Meu nome é $nome")

    // Raw strings
    var dataAtual = 2022
    val dataNasc = 2004

    //O método trimIndent exclui automaticamente os espaços da identação do código.
    println("""
        Meu nome é $nome, nasci em $dataNasc
        então até o fim de $dataAtual terei
        ${2022 - 2004} anos
    """.trimIndent())

}