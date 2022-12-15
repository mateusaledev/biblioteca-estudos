package exemplos

open class Maquinario1(val marca: String){
    open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador1(marca: String, val nucleos: Int) : Maquinario1(marca){

    // override - sobreescrever
    override fun minhaMarca() {
        "Estou reescrevendo minha marcar!!"
    }

    fun ligar(){}
    fun processar(){}

    // Overload - Sobrecarga
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: Int, s: String) = println("Overload 2")
    fun overload(i: Int, b: Boolean) = println("Overload 3")

}

fun main() {
    val c: Computador1 = Computador1("mktech", 100)
    with(c){
        ligar()
        processar()
        minhaMarca()
        overload(10)
        overload(10, "mk")
        overload(10, true)
    }
}