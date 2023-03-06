/*
    takeLast fonksiyonu, Kotlin'de bir koleksiyondan belirli sayıda son elemanı almak için kullanılır.
    Bu fonksiyon, bir sayısal değer alır ve koleksiyonun sonundan belirtilen sayıda elemanı alarak yeni bir koleksiyon oluşturur.

    takeLast fonksiyonu aşağıdaki şekilde kullanılabilir:
 */

fun main() {
    val chars = ('a'..'z').toList()

    // Take the last 3 chars
    val lastThreeChars = chars.takeLast(3)

    // Take the last 10 chars (if the collection has less than 10 elements, returns all of them)
    val lastTenChars = chars.takeLast(10)

    println("the last 3 chars : $lastThreeChars")
    println("the last 10 chars : $lastTenChars")
}

// takeLast fonksiyonu, özellikle büyük koleksiyonlardan yalnızca birkaç son eleman almak istediğinizde kullanışlıdır.