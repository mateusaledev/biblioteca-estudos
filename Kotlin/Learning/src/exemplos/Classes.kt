package exemplos

class Pessoa1

class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(var nome: String){
    var ano: Int? = null
    constructor(nome: String, ano: Int) : this (nome){
        this.ano = ano
    }

    fun saudacao(){
        println("Hi, my name is $nome and my birthday is $ano")
    }
}

fun main(){

    val p1: Pessoa3 = Pessoa3("Mateus", 2001)
    val p2: Pessoa3 = Pessoa3("Julli")

    p1.saudacao()
    p2.saudacao()
}