package exemplos

abstract class Mamifero(var nome: String) {

    var peso: Float = 0f

    abstract fun falar()
    open fun dormir() {
        println("Estou dormindo")
    }
}

class Cachorro(nome: String, meuPeso: Float) : Mamifero(nome){
    init {
        this.peso = meuPeso
    }

    override fun falar() {
        println("Au Au Au")
    }
}

class Gato(nome: String, meuPeso: Float) : Mamifero(nome){
    override fun falar() {
        println("Miallll")
    }
}

fun main() {
    Gato("Tony", 10f).falar()
}