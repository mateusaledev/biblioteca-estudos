fun main() {
    /* ################################################## */
    /*               COMO CRIAR COLEÇÕES                  */
    /* ################################################## */
    // ArrayList - Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Maça")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    // ArrayList - Função
    val frutas2 = arrayListOf("Maça", "Banana", "Morango")
    println(frutas2)

    /* ################################################## */
    /*               BIBLIOTECA PADRÃO JAVA               */
    /* ################################################## */

    // Vamos confirmar que de fato as coleções são da biblioteca
    // Java padrão
    println(HashSet::class.java)

    // Podemos tirar muito mais proveito das coleções em Kotlin
    println(frutas2.last())

    val numeros = setOf(1, 14, 2)
    println(numeros.max())
}