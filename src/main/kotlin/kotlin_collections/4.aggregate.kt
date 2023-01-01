package kotlin_collections

import java.util.*


/**
 * "aggregate" fonksiyonu, bir veri yapısındaki elemanları anahtarına göre gruplamak ve her gruptaki elemanlar üzerinde ardışık olarak bir işlem gerçekleştirmek için kullanılır.
 * Bu işlem, bir lambda ifadesi olarak verilir ve lambda ifadesinin ilk iki argümanı, veri yapısındaki iki elemandır.
 * Bu lambda ifadesinin döndürdüğü değer, bir sonraki eleman ile işleme katılır ve bu şekilde sürekli devam eder.
 * Sonuç olarak, her gruptaki elemanlar üzerinde gerçekleştirilen işlemlerin sonuçlarını içeren yeni bir harita döndürür.
 */


fun main() {
    val random = Random()
    val randomNumbers = List(10) { random.nextInt(100) }
    println(randomNumbers)

    val aggregated = randomNumbers.groupingBy { it % 3 }.aggregate { key, accumulator: StringBuilder?, element, first ->
        if (first) // first element
            StringBuilder().append(key).append(":").append(element)
        else
            accumulator!!.append("-").append(element)
    }

    println(aggregated.values) // [0:3-6-9, 1:4-7, 2:5-8]

    /*
    Bu kod, 0 ve 99 arasında (dahil) 10 tane rastgele tamsayı üretir ve sonra liste elemanlarını 3'e bölümünden kalan ile gruplar.
    groupingBy fonksiyonu, kalanların anahtarlar olduğu ve o kalanların elemanların listesi olan bir harita döndürür.

    Sonra, aggregate fonksiyonu kullanılarak, anahtarların kalanlar ve değerlerin liste elemanlarını temsil eden dizgiler olan yeni bir map oluşturulur.
    aggregate fonksiyonu, liste elemanlarını bir şekilde birleştiren bir lambda fonksiyonu alır.
    Bu durumda, lambda fonksiyonu, her gruptaki ilk eleman için yeni bir StringBuilder oluşturur ve sonraki elemanlarını ona - ile ayrılmış şekilde ekler.

    Son olarak, aggregated map'inin values özelliği yazdırılır, böylece eleman gruplarını temsil eden dizgi listesi elde edilir.
     */
}