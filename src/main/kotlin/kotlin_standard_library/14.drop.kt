/*
    drop fonksiyonu, Kotlin'de bir koleksiyondan belirli sayıda elemanı atmak için kullanılır.
    Bu fonksiyon, bir sayısal değer alır ve koleksiyonun başından belirtilen sayıda elemanı atarak yeni bir koleksiyon oluşturur.

    drop fonksiyonu aşağıdaki şekilde kullanılabilir:
 */

fun main() {
    val chars = ('a'..'z').toList()

    // Drop the first 3 chars
    val withoutFirstThreeChars = chars.drop(3)

    // Drop the first 10 chars (if the collection has less than 10 elements, returns an empty collection)
    val withoutFirstTenChars = chars.drop(10)

    println("Drop first 3 chars : $withoutFirstThreeChars")
    println("Drop first 10 chars : $withoutFirstTenChars")
}

// drop fonksiyonu, özellikle büyük koleksiyonlardan başlangıçta belirli sayıda elemanı atmak istediğinizde kullanışlıdır.