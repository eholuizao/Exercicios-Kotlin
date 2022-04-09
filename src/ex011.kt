fun main(args: Array<String>) {
    var n: Int = 7
    // n = n + 1 ou n = n.inc()
    n++

    var x = 4
    var y = x++

    var a = 4
    var b = ++a

    println("A variável tem valor $n")
    println("X = $x, Y = $y")
    println("A = $a, Y = $b (Usando pré incremento)")
}