package exemplos

open class Maquinario(val marca: String){
    fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquinario(marca){
    fun ligar(){}
    fun processar(){}
}

fun main() {
    val c: Computador = Computador("mktech", 100)
    with(c){
        ligar()
        processar()
        minhaMarca()
    }
}