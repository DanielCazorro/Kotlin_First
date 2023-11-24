var texto: String? = null

fun main() {
    texto = "1"

    // Using let to perform an operation when the value is not null
    texto.let {
        if (it != null)
            println(it.toInt())
    }

    // Safe call with let to perform the operation when the value is not null
    texto?.let {
        println(it.toInt())
    }

    // Safe call operator with run to perform the operation when the value is not null
    texto?.run {
        println(this.toInt())
    }

    // Using also for additional processing without changing the context
    texto?.also {
        println(it.toInt())
    }

    // Apply is similar to also but returns the receiver object
    texto?.apply {
        println(this.toInt())
    }
}
