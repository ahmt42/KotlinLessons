package kotlin_standard_library

/**
 * Kotlin eachCount, Grouping kaynağındaki elemanları anahtarına göre gruplar ve her grup içindeki elemanları sayar.  ve sonuç olarak bir Grouping nesnesi döndürür.
 * Örneğin, bir dizideki sayıları gruplandırarak kaç kez geçtiğini saymak için kullanılabilir.
 */



fun main() {
    val list = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3)
    val groupByCount = list.groupingBy { it }.eachCount()
    println(groupByCount)

    // Bir metin dizisinde kelime sayısını hesaplama. Her kelimeyi tekrar edenleri ayırarak kelime sayısını hesaplama.

    val words = "Başarılı bir mühendis olarak, yaptığım projelerde en önemli şeyin kalite ve doğruluk olduğunu düşünüyorum, bu yüzden her zaman en iyi malzemeleri ve en yeni teknolojik araçları kullanmaya çalışıyorum, ancak aynı zamanda tasarım esnekliği ve maliyet etkinliğini de dikkate alarak, müşteri beklentilerini karşılamaya çalışıyorum."
        .split(' ')
    val wordCount = words.groupingBy { it }.eachCount()
    println("wordCount değişkeni şu şekilde bir map olacaktır:")
    println(wordCount)
}
