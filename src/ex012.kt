fun main(args: Array<String>) {
    var v1 = 5
    var v2 = 8
    var v3 = 3
    var v4 = 2

    /* primeiro o parenteses, depois a soma, depois a igualdade, depois a negação e por último a conjunção AND(&&) */
    var res = !(v1 < v2) && v2 == v1 + 3

    /* primeiro o parenteses, dentro dos parentes primeiro vem a divisão e a subtração e depois a desigualdade, após
    * isso vem a operação de maior(>) e por último o operador lógico de conjunção AND(&&)*/
    var res2 = v1 > v2 && (v3 - 1 != v1 / v4)

    println(res) //false
    println(res2) //false
}