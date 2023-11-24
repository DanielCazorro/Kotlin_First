# MiPrimerProgramaEnKotlin

Teoría y ejercicios básicos Kotlin

# Proyecto de Tiradas de Dado y Análisis Estadístico

Este proyecto en Kotlin se enfoca en la simulación de tiradas de dados y un analizador estadístico para estas tiradas. Incluye clases para la simulación del dado, funciones para realizar tiradas simples y múltiples, así como un analizador estadístico para evaluar las estadísticas de las tiradas realizadas.

## Contenido

- [Clases](#clases)
- [Uso](#uso)
- [Funcionalidades](#funcionalidades)
- [Ejemplos](#ejemplos)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Contribuir](#contribuir)
- [Autor](#autor)
- [Licencia](#licencia)

## Clases

### `Dado`

La clase `Dado` simula un dado con valores mínimos y máximos definidos. Permite realizar tiradas simples y múltiples, así como obtener el histórico de las tiradas.

### `AnalizadorEstadistico`

La clase `AnalizadorEstadistico` se encarga de analizar las tiradas del dado. Calcula el número de tiradas, cuenta las apariciones de cada valor y calcula la media de las tiradas realizadas.

## Uso

El código proporcionado puede ser utilizado para realizar tiradas de dados y analizar estadísticas sobre estas tiradas. Puedes ejecutar el código para realizar tiradas simples o múltiples, así como para obtener análisis estadísticos de las tiradas.

## Funcionalidades

- Realizar tiradas simples y múltiples de un dado con valores definidos.
- Analizar las tiradas realizadas para calcular el número de tiradas, contar apariciones de valores y calcular la media.

## Ejemplos

Aquí tienes algunos ejemplos básicos de cómo usar las clases y funciones proporcionadas:

```kotlin
// Ejemplo de uso de la clase Dado y el analizador estadístico
fun main() {
    val dado1 = Dado(1, 6)
    println(dado1.tiradaSimple())
    println(dado1.tiradaMultiple(100))
    // ... (otros ejemplos de uso)
    val analizador = AnalizadorEstadistico()
    analizador.analizarDado(dado1)
}

