fun main() {
    // Imprimir mensajes iniciales
    println("Hello World!!!")

    // Variables booleanas
    var miBooleanTrue = true
    val miBooleanFalse = false
    println(miBooleanTrue)
    println(miBooleanFalse)

    miBooleanTrue = false
    println(miBooleanTrue)

    // Operaciones aritméticas con enteros
    var miEntero = 1
    println(miEntero)
    miEntero = 1 + 2
    println(miEntero)
    miEntero = 2 - 1
    println(miEntero)
    miEntero = 2 * 1
    println(miEntero)
    miEntero = 2 / 1
    println(miEntero)
    miEntero += 3
    println(miEntero)
    miEntero -= 1
    println(miEntero)
    miEntero *= 2
    println(miEntero)
    miEntero /= 2
    println(miEntero)
    miEntero = 9/2
    println(miEntero)
    println(miEntero.toDouble())




    // Operaciones con decimales
    var miDecimal = 1.0
    println(miDecimal)
    miDecimal = 1.0 + 1
    println(miDecimal)
    miDecimal = 9.0 / 2
    println(miDecimal)
    println(miDecimal.toInt())

    // Operaciones con caracteres y texto
    var miLeta = 'a'
    println(miLeta)
    miLeta += 1
    println(miLeta)
    miLeta = '2'
    println(miLeta.digitToInt())

    var miText = "Hold"
    println(miText)
    miText = "Hold" + " " + "que tal"
    println(miText)
    miText = "Soy el numerous $miEnter"
    println(miText)
    miEnter = 2
    println(miEnter)

    miDecimal = 5.0
    println(miDecimal)

    miLeta = 'g'
    println(miLeta)

    miText = "Amigo"
    println(miText)

    // Tipos de datos numéricos
    val miByte : Byte = 1
    println(miByte)

    val miShort : Short = 1
    println(miShort)

    val miLong1 : Long = 1
    println(miLong1)

    val miLong2 = 1L
    println(miLong2)

    // Conversión de tipos
    var suma = miEnter + miByte.toLong()

    val miShort2 : Short = 200
    println(miShort2.toByte())

    val i : Int? = null
    i?.toDouble()

    val miText2 : String? = null
    println(miText2?.length)

}