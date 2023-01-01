package kotlin_collections


fun main() {

    /**
     * groupBy() fonksiyonu bir seçici fonksiyon alır ve döndürdüğü harita,
     * anahtarın orijinal koleksiyondaki öğeler üzerine uygulanan seçici fonksiyonun sonucu olduğu
     * ve aynı anahtara sahip öğeleri içeren listelerin değerleri olduğu haritadır.
     */

    // groupBy()'ı sayıların tek ve çift olma durumuna göre gruplamak için kullanabileceğimiz bir örnek:

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val groups = numbers.groupBy { it % 2 == 0 }
    println(groups)

    // groups şu anda iki anahtarı olan bir harita: true ve false
    // true anahtarının değeri, çift sayıların bir listesi [2, 4, 6, 8, 10]
    // false anahtarının değeri, tek sayıların bir listesi [1, 3, 5, 7, 9]


    /**
     * Ayrıca, groupBy()'a ikinci bir argüman olarak bir dönüştürme fonksiyonu da geçirebiliriz.
     * Bu fonksiyon, anahtarın seçici fonksiyon kullanılarak hesaplanmadan önce, orijinal koleksiyonun her öğesi üzerinde uygulanır.
     * Bu, örneğin, bir dizi kelimenin uzunluğuna göre gruplamak istediğimizi,
     * ancak haritanın değerlerinin kelimelerin büyük harfli versiyonları olmasını istediğimizi düşünürsek yararlı olabilir.
     */

    val words = listOf("a", "ab", "abc", "abcd", "abcde")
    val groups2 = words.groupBy({ it.length }, { it.uppercase() })
    println(groups2)


}