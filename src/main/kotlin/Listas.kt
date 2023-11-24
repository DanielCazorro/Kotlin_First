fun main() {
    // Mutable Lists
    val mutableList1 = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList1)
    mutableList1[1] = 1
    println(mutableList1)
    mutableList1.add(99)
    println(mutableList1)
    mutableList1.removeAt(2)
    println(mutableList1)
    mutableList1.add(0, -1)
    println(mutableList1)

    var mutableList2 = MutableList(10) { it }
    println(mutableList2)
    mutableList2.add(99)
    println(mutableList2)
    mutableList2 = mutableListOf(2, 4)
    println(mutableList2)

    // Lists
    val list1 = List(5) { "Tengo el elemento ${it * 5}" }
    println(list1)

    var list2 = List(5) { "Tengo el elemento ${it * 5}" }
    println(list2)
    list2 = listOf("Hola", "Adios")
    println(list2)

    // Converting from List to MutableList
    var mutableList3 = list2.toMutableList()
    mutableList3.add("!")
    println(mutableList3)
    println(list2)

    // Iterating through lists
    for (elemento in mutableList3) {
        println(elemento)
    }

    list2.forEach { elemento ->
        println(elemento)
    }

    mutableList2.forEachIndexed { index, elemento ->
        println("Soy el elemento $elemento y estoy en la posición $index")
    }
}
