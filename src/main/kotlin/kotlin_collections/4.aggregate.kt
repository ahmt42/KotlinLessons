package kotlin_collections

import java.util.*


/**
 * Kotlin dilinde "aggregate" fonksiyonu, bir veri yapısındaki elemanları anahtarına göre gruplamak ve her gruptaki elemanlar üzerinde ardışık olarak bir işlem gerçekleştirmek için kullanılır.
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
}