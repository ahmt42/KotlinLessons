fun main() {
    val number = 5
    val result = number.takeIf { it > 0 }
    println(result) // Output: 5

    val negativeNumber = -5
    val result2 = negativeNumber.takeIf { it > 0 }
    println(result2) // Output: null
}

/*
Bu örnekte, iki değişkenimiz number ve negativeNumber var.
number'ın değerinin 0'dan büyük olup olmadığını kontrol etmek için takeIf() eklenti fonksiyonunu kullanıyoruz.
Değer büyük olduğu için fonksiyon 5 değerini döndürür.

Diğer taraftan, negativeNumber üzerinde takeIf() kullandığımızda,
negativeNumber'ın değeri 0'dan büyük değil olduğundan fonksiyon null döndürür.

takeIf() fonksiyonu, if ifadeleri kullanmaksızın basit koşulları yapmak için kısa ve öz bir yoldur ve kodunuz daha okunabilir ve özgündür.
 */