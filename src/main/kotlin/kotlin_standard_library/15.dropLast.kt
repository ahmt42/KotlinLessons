/*
    dropLast fonksiyonu, Kotlin'de bir koleksiyondan belirli sayıda son elemanı atmak için kullanılır.
    Bu fonksiyon, bir sayısal değer alır ve koleksiyonun sonundan belirtilen sayıda elemanı atarak yeni bir koleksiyon oluşturur.

    dropLast fonksiyonu aşağıdaki şekilde kullanılabilir:
 */

fun main() {
    val chars = ('a'..'z').toList()

    // Drop the last 3 chars
    val withoutLastThreeChars = chars.dropLast(3)

    // Drop the last 10 chars (if the collection has less than 10 elements, returns an empty collection)
    val withoutLastTenChars = chars.dropLast(10)

    println("Drop last 3 chars : $withoutLastThreeChars")
    println("Drop last 10 chars : $withoutLastTenChars")
}