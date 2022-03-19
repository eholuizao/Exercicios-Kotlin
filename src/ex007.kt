fun main(args: Array<String>) {
    val n1 = 5
    val n2 = 2

    /*
    Em kotlin, podemos usar os operadores aritméticos ou os métodos. O compilador sempre converterá os operadores
    para os métodos.
    */
    
    println(n1.plus(n2)) //+
    println(n1.minus(n2)) // -
    println(n1.times(n2)) // *
    println(n1.div(n2.toFloat())) // /
    println(n1.rem(n2)) // %
}