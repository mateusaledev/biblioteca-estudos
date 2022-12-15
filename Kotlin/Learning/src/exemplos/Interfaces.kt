package exemplos

interface Tigre {
    fun ligar()
    fun desligar(){
        println("off")
    }
}

class Leao(var peso: Float) : Tigre{
    override fun ligar() {
    }
}

interface interface1{
    fun ola(){
        println("Interface 1")
    }
}

interface interface2{
    fun ola(){
        println("Interface 2")
    }
}

class ImplementaInterface : interface1, interface2 {
    override fun ola() {
        super<interface1>.ola()
    }
}

fun main() {
}