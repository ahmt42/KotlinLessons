/*
    take fonksiyonu, Kotlin'de bir koleksiyondan belirli sayıda eleman almak için kullanılır.
    Bu fonksiyon, bir sayısal değer alır ve koleksiyonun başından itibaren belirtilen sayıda eleman alarak yeni bir koleksiyon oluşturur.

    take fonksiyonu aşağıdaki şekilde kullanılabilir:
 */

fun main() {
    val chars = ('a'..'z').toList()

    // Take the first 3 chars
    val firstThreeChars = chars.take(3)

    // Take the first 10 chars (if the collection has less than 10 elements, returns all of them)
    val firstTenChars = chars.take(10)

    println("the first 3 chars : $firstThreeChars")
    println("the first 10 chars : $firstTenChars")
}

// take fonksiyonu, özellikle büyük koleksiyonlardan yalnızca birkaç eleman almak istediğinizde kullanışlıdır.