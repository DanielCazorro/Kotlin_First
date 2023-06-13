fun main(args: Array<String>) {
    println("Holy Amigos")

    var miBooleanTrue = true
    val miBooleanFalse = false
    println(miBooleanTrue)
    println(miBooleanFalse)

    miBooleanTrue = false
    println(miBooleanTrue)

    // como miBooleanFalse es de un VAL, no pupped cambial el valor a true


    var miEnter = 1
    println(miEnter)
    miEnter = 1 + 2
    println(miEnter)
    miEnter = 2 - 1
    println(miEnter)
    miEnter = 2 * 1
    println(miEnter)
    miEnter = 2 / 1
    println(miEnter)
    miEnter += 3
    println(miEnter)
    miEnter -= 1
    println(miEnter)
    miEnter *= 2
    println(miEnter)
    miEnter /= 2
    println(miEnter)
    miEnter = 9/2
    println(miEnter)
    println(miEnter.toDouble())




    var miDecimal = 1.0
    println(miDecimal)
    miDecimal = 1.0 + 1
    println(miDecimal)
    miDecimal = 9.0 / 2
    println(miDecimal)
    println(miDecimal.toInt())

    var miLeta = 'a'
    println(miLeta)
    miLeta += 1
    println(miLeta)
    miLeta = '2'
    println(miLeta.digitToInt())

    var miTexto = "Hola"
    println(miTexto)
    miTexto = "Hola" + " " + "que tal"
    println(miTexto)
    miTexto = "Soy el número " + miEnter
    println(miTexto)
    miEnter = 2
    println(miEnter)

    miDecimal = 5.0
    println(miDecimal)

    miLeta = 'g'
    println(miLeta)

    miTexto = "Amigo"
    println(miTexto)

    val miByte : Byte = 1
    println(miByte)

    val miShort : Short = 1
    println(miShort)

    val miLong1 : Long = 1
    println(miLong1)

    val miLong2 = 1L
    println(miLong2)

    var suma = miEnter + miByte.toLong()

    val miShort2 : Short = 200
    println(miShort2.toByte())

    val i : Int? = null
    i?.toDouble()

    val miText2 : String? = null
    println(miText2?.length)

}