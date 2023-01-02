package kotlin_collections


fun main() {

    /**
     *  groupByTo() fonksiyonu Kotlin dilinde bir koleksiyonu belirli bir anahtara göre gruplamaya yarar.
     *  Bu fonksiyon, bir seçici fonksiyon ve hedef bir harita alır ve seçici fonksiyonu kullanarak koleksiyondaki öğeleri hedef haritaya gruplar.
     *  Eğer aynı anahtara sahip öğeler varsa, bunlar hedef haritanın bu anahtarının değerine eklenir.
     */

    // Örneğin, aşağıdaki kod bir sayı listesini tek ve çift olma durumuna göre gruplar ve sonuçları groups isimli bir MutableMap'e ekler:

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val groups = mutableMapOf<Boolean, MutableList<Int>>()
    numbers.groupByTo(groups, { it % 2 == 0 })
    println(groups)

    // groups şu anda iki anahtarı olan bir harita: true ve false
    // true anahtarının değeri, çift sayıların bir listesi [2, 4, 6, 8, 10]
    // false anahtarının değeri, tek sayıların bir listesi [1, 3, 5, 7, 9]


    /**
     * Ayrıca, groupByTo() fonksiyonu bir dönüştürme fonksiyonu da alabilir.
     * Bu fonksiyon, anahtarın hesaplanmasından önce koleksiyondaki her öğe üzerinde uygulanır ve hedef haritanın değerlerini oluşturur.
     * Örneğin, aşağıdaki kod bir dizi kelimeyi uzunluklarına göre gruplar ve sonuçları groups isimli bir MutableMap'e ekler, ancak değerler büyük harfli kelimelere dönüştürülür:
     */

    val words = listOf("a", "ab", "abc", "abcd", "abcde")
    val groups2 = mutableMapOf<Int, MutableList<String>>()
    words.groupByTo(groups2, { it.length }, { it.uppercase() })
    println(groups2)
}