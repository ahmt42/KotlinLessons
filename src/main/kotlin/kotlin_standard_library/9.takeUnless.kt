/*
takeUnless() eklenti fonksiyonu, yargı mantığının tersi olarak çalışan bir kolay yoldur.
Bu, yargı (Boolean dönderen bir işlev) argüman olarak alır ve yargı true döndürmezse alıcı nesneyi, aksi takdirde null döndürür.
 */

fun main() {
    val number = 5
    val result = number.takeUnless { it > 0 }
    println(result) // Output: null

    val negativeNumber = -5
    val result2 = negativeNumber.takeUnless { it > 0 }
    println(result2) // Output: -5
}

