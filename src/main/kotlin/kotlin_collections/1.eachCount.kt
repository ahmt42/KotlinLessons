package kotlin_collections

/**
 * Kotlin eachCount, Grouping kaynağındaki elemanları anahtarına göre gruplar ve her grup içindeki elemanları sayar.  ve sonuç olarak bir Grouping nesnesi döndürür.
 * Örneğin, bir dizideki sayıları gruplandırarak kaç kez geçtiğini saymak için kullanılabilir.
 */



fun main() {
    val list = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3)
    val groupByCount = list.groupingBy { it }.eachCount()
    println(groupByCount)

    // groupByCount değişkeni şu şekilde bir map olacaktır:
    // {1: 2, 2: 2, 3: 2, 4: 2, 5: 2}


    // Bir metin dizisinde kelime sayısını hesaplayın. Her kelimeyi tekrar edenleri ayırarak kelime sayısını hesaplayın.

    val words = "Başarılı bir mühendis olarak, yaptığım projelerde en önemli şeyin kalite ve doğruluk olduğunu düşünüyorum, bu yüzden her zaman en iyi malzemeleri ve en yeni teknolojik araçları kullanmaya çalışıyorum, ancak aynı zamanda tasarım esnekliği ve maliyet etkinliğini de dikkate alarak, müşteri beklentilerini karşılamaya çalışıyorum."
        .split(' ')
    val wordCount = words.groupingBy { it }.eachCount()
    println("wordCount değişkeni şu şekilde bir map olacaktır:")
    println(wordCount)
}
