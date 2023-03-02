/*
    filter fonksiyonu, Kotlin'de bir koleksiyonun elemanları üzerinde filtreleme işlemi yapmak için kullanılır.
    Bu fonksiyon, belirli bir koşulu karşılayan elemanları içeren yeni bir koleksiyon oluşturur.
 */

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)

    // Filter even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)

    // Filter numbers greater than 3
    val numbersGreaterThan3 = numbers.filter { it > 3 }
    println(numbersGreaterThan3)
}

/*
    Yukarıdaki örnekte, numbers adlı bir List koleksiyonu oluşturuldu.
    Ardından, filter fonksiyonu kullanılarak, evenNumbers adlı yeni bir koleksiyon oluşturuldu ve bu koleksiyon sadece çift sayıları içerir.
    Aynı şekilde, numbersGreaterThan3 adlı bir başka yeni koleksiyon da oluşturuldu ve bu koleksiyon sadece 3'ten büyük sayıları içerir.
 */