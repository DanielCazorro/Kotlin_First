import kotlin.random.Random

fun main() {
    val dado1 = Dado(1, 6)
    println(dado1.tiradaSimple())
    println(dado1.tiradaMultiple(100))
    println(dado1.tiradaMultiple(100))
    println(dado1.tiradaSimple())

    dado1.mostrarHistorico()
    val analizador = AnalizadorEstadistico()
    analizador.analizarDado(dado1)
}

class AnalizadorEstadistico() {
    fun analizarDado(dado: Dado) {
        println("El número de tiradas es ${dado.obtenerNumeroTiradas()}")

        println(dado.contarApariciones())

        println(dado.calcularMedia())
    }
}

open class Dado(private val valorMin: Int, private val valorMax: Int) {
    private val historicoTiradas = mutableListOf<Int>()

    fun tiradaSimple(): Int {
        val numAleatorio = Random.nextInt(valorMin, valorMax + 1)
        historicoTiradas.add(numAleatorio)
        return numAleatorio
    }

    fun tiradaMultiple(repeticiones: Int): List<Int> {
        val list = mutableListOf<Int>()
        repeat(repeticiones) {
            list.add(tiradaSimple())
        }
        return list
    }

    fun mostrarHistorico() {
        println(historicoTiradas)
    }

    fun obtenerNumeroTiradas(): Int {
        return historicoTiradas.size
    }

    fun contarApariciones(): String {
        val listaResultado = MutableList(valorMax - valorMin + 1) { 0 }

        historicoTiradas.forEach {
            listaResultado[it - valorMin] += 1
        }
        return listaResultado.toString()
    }

    fun calcularMedia(): String {
        val sumatorio = historicoTiradas.sum()
        val media = sumatorio / historicoTiradas.size.toDouble()
        return media.toString()
    }
}
