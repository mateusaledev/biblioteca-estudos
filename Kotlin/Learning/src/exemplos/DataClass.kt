package exemplos

// Sem data class
class Quadrado(val area: Float){
    override fun toString(): String {
        return "Quadrado(area=$area)"
    }
}
// Com data class
data class Triangulo(val area: Float)

fun main() {

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    // copy
    val t3 = t2.copy()
    println(t3)
    println(q1)
    println(t1)
}