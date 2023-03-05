/*
    mapIndexed fonksiyonu, Kotlin'de bir koleksiyondaki elemanları belirtilen bir işleme tabi tutarak yeni bir koleksiyon oluşturur.
    map fonksiyonundan farklı olarak, mapIndexed fonksiyonu her elemanın konumunu (indisini) de belirtilen işleme ile birlikte alır.

    mapIndexed fonksiyonu aşağıdaki şekilde kullanılabilir:
 */

fun main() {
    val numbers = listOf(101, 222, 311, 404, 590)

    // Multiply each number by its index
    val multipliedNumbers = numbers.mapIndexed { index, number -> index * number }

    // Convert each number to a string with its index
    val stringNumbers = numbers.mapIndexed { index, number -> "$index: $number" }

    println(stringNumbers)
}