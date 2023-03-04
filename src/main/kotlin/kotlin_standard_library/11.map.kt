/*
    map fonksiyonu, Kotlin'de bir koleksiyondaki elemanları değiştirmek veya dönüştürmek için kullanılır.
    Bu fonksiyon, bir koleksiyondaki her bir eleman üzerinde belirtilen işlemi gerçekleştirir ve sonuçları yeni bir koleksiyonda toplar.

    Kotlin'de map fonksiyonu aşağıdaki şekilde kullanılabilir:
 */

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Multiply each number by 2
    val multipliedNumbers = numbers.map { it * 2 }

    println(multipliedNumbers)
}

/*
    Yukarıdaki örnekte, numbers adlı bir List koleksiyonu oluşturuldu.
    Ardından, map fonksiyonu kullanılarak, multipliedNumbers adlı yeni bir koleksiyon oluşturuldu
    ve bu koleksiyon, numbers koleksiyonundaki her bir sayıyı 2 ile çarparak elde edilir.
 */