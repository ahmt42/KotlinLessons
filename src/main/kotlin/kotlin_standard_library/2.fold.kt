package kotlin_standard_library

/**
 * "fold" işleminin amacı, bir gruplama kaynağındaki öğeleri anahtarına göre gruplandırmak ve her grup öğesi için işlemi sırasıyla uygulamaktır.
 * Bu işlem, önceki birikmiş değer ve mevcut öğeyi argüman olarak alır ve sonuçları yeni bir harita içinde saklar.
 * Biriktirici için başlangıç değeri, her grup için aynı başlangıç değeridir.
 */

fun main () {
    //Bir dizideki çift ve tek sayıları gruplandırın ve her gruptaki sayıların toplamını hesaplayın :

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    val groupedNumbers = numbers.groupingBy { it % 2 == 0 }.fold(0) { acc, i -> acc + i }
    println(groupedNumbers)

    // groupedNumbers değişkeni şu şekilde bir map olacaktır:
    // {false=36, true=30}


    // şehirleri ilk harflerine göre grupla ve yalnızca harf sayısı çift olan şehirleri al :

    val cities = listOf("Ankara", "Adana", "İstanbul", "İzmir", "Konya", "Kayseri", "Kütahya", "Bursa", "Denizli")

    val evenCities = cities.groupingBy { it.first() }
        .fold(listOf<String>()) { acc, e -> if (e.length % 2 == 0) acc + e else acc }

    println(evenCities)
}

