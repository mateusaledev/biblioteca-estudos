package exemplos

class Maquina(var marca: String){

    var nucleos: Int = 0
        get(){
            println("Get foi chamado")
            return field
    }
        set(value){
            println("Set foi chamado")
            field = value
        }
}

fun main(){
    var m = Maquina("mktech")
    println(m.nucleos)
    m.nucleos = 10
}