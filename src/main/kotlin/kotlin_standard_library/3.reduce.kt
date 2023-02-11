package kotlin_standard_library

import java.util.*

/**
 * reduce()
 * Grup kaynağındaki elemanları anahtarına göre gruplar ve her gruptaki elemanlara ardışık olarak birleştirme işlemini uygular,
 * grupun ikinci elemanından itibaren birikmiş değer ve geçerli elemanı argüman olarak geçirir ve sonuçları yeni bir harita içinde saklar.
 * Biriktirici için bir başlangıç değeri, grupun ilk elemanıdır.
 */

fun main() {

    // örnek 1
    // Burada, bir liste içindeki sayıları gruplamak ve her gruptaki elemanlar arasında en büyük değeri bulmak için "reduce" fonksiyonunu kullanacağız:
    val random = Random()
    val randomNumbers = List(10) { random.nextInt(100) }
    println(randomNumbers)

    // tek/çift gruplama ve her grubun en büyüğünü alma
    val maxOfEachGroup = randomNumbers.groupingBy { it % 2 == 0 }.reduce { _, a, b -> maxOf(a, b) }

    println(maxOfEachGroup) // {false=5, true=10}


    println()


    // örnek 2
    val animals = listOf("raccoon", "reindeer", "cow", "camel", "giraffe", "goat")

    // ilk karaktere göre gruplama ve her grubun max sayıda sesli harf içeren elemanını alma
    val compareByVowelCount = compareBy { s: String -> s.count { it in "aeiou" } }

    val maxVowels = animals.groupingBy { it.first() }.reduce { _, a, b -> maxOf(a, b, compareByVowelCount) }

    println(maxVowels) // {r=reindeer, c=camel, g=giraffe}

    /**
     * Bu kod parçacığında, bir liste içindeki hayvan isimlerini ilk harflerine göre gruplamakta ve her gruptaki elemanları sesli harfler içerme sayılarına göre karşılaştırmaktadır.
     * Daha sonra, her gruptaki elemanların arasındaki en fazla sesli harf içeren elemanı bulmak için "reduce" fonksiyonunu kullanmaktadır.
     * Sonuç olarak, her gruptaki en fazla sesli harf içeren elemanı içeren bir harita döndürür.
     *
     * Örneğin, "r" harfi ile başlayan elemanlar grubu içinde "reindeer" isimli hayvan en fazla sesli harf içerir ve bu yüzden bu eleman "r" harfi için seçilir.
     * Benzer şekilde, "c" harfi ile başlayan elemanlar grubu içinde "camel" isimli hayvan en fazla sesli harf içerir ve bu yüzden bu eleman "c" harfi için seçilir.
     * Benzer şekilde diğer gruplar için de aynı işlem gerçekleştirilir ve sonuç olarak bir harita döndürür. *
     */
}




