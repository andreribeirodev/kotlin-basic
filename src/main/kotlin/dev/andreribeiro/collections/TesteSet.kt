package dev.andreribeiro.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0,"CLT")
    val maria = Funcionario("Maria", 4000.0,"PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{
        println(it)
    }
}