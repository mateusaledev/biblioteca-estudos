package exemplos

class Maquina1(var marca: String){

    var nucleos: Int = 0
        get(){
            println("Get foi chamado")
            return field
        }
        set(value){
            println("Set foi chamado")
            field = value
        }

    fun ligar(){

    }
    fun processar(){

    }
    fun desligar(){

    }
}

fun main(){
    var m = Maquina1("mktech")

    with(m){
        ligar()
        processar()
        desligar()
    }
}