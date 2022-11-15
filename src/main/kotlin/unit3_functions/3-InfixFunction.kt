package unit3_functions


fun main() {
    /**
     *      Daha okunakli kodlar yazmak icin kullanilir.
     *      . (nokta) kullanimini kaldirir.
     *      Bir fonksiyonu infix hale getirebilmek icin 5 sart vardir.
     *      1. infix keywordu ile baslar.
     *      2. fonksiyon bir uye fonksiyon olmalidir. (bir sinifa ait olmalidir) // bir class'in icerisine yazilmis olmasi lazim, duz bir dosyaya yazılmış fonksiyonu infix yapamıyoruz.
     *      3. ya da bir extension fonksiyon olmalidir.
     *      4. sadece bir parametre almalidir. Bu parametre vararg olamaz. Bi cakal sizsiniz :)
     *      5. infix method'un parametresi default deger alamaz.
     *
     *      Yapisal olarak;
     *
     *      infix fun infixMethod(justOneParam : AwesomeParam) : Whatever{
     *
     *      }
     * **/

    val isStudent = false
    val isMale = true

    /**
     *      and, or, xor gibi onlarca infix method vardir.
     * **/
    if (!isStudent and isMale) {
        print("Öğrenci Olmayan Erkek")
    }

    // infix kullanimi
    isStudent and isMale
    isStudent.and(isMale)

    val awesomeInstance = AwesomeClass()
    // infix kullanimi
    awesomeInstance downloadImage "www.google.com.tr"

    val number = 5
    // matematiksel operatorlerin, tip donusumlerin (type conversion), range kullanimin, infix methodlara karsi islem onceligi vardir.
    if (number + number - 2 * (awesomeInstance specialPlus 4) == 5) {

    }

    // infix methodlarin da mantik operatorlerine gore onceligi vardir.
    if (number == 3 && number < 5 || awesomeInstance specialPlus 4 == 5) {

    }
}

class AwesomeClass {
    /*
    infix fun downloadImage(imageUrl : String = "Ahmet"){

    }
     */
    // default deger 'den dolayı calismaz.


    infix fun downloadImage(imageUrl: String) {

    }

    infix fun specialPlus(number: Int): Int {
        return 4
    }


    /*
    infix fun <T> downloadImage2(vararg mageUrl : T){

    }
     */
    // vararg 'dan dolayı calismaz


    // bir sinifin icindeyken this kullanimi size bulundugu sinifi isaret eder.
    // asagidaki kullanimda AwesomeClass().downloadImage(imageUrl) kullanimi olusur aslinda. (implicit)
    fun logWhenImageDownloaded(imageUrl: String) {
        // calisir, dogru kullanim. infix kullanım değil ama.
        downloadImage(imageUrl)

        // calismaz, infix fonksiyonu bu sekil cagrilamaz.
        // downloadImage imageUrl

        this downloadImage imageUrl
        // AwesomeClass() downloadImage imageUrl
    }


// this; class'ın içerisindeyken kullanıyorsak class'ı, interface'lerin içerisinde kullanıyorsak da interface'i verir.
// eğer bir infix fonksiyonu bağlı bulunduğu class'ın içerisinde infix gibi kullanmak istiyorsanız bu durumda "this fonksiyonun ismi parametresi"ni vermeniz lazım, "direk fonksiyonun ismi parametre" olarak çağıramayız.

}


// bir sinifin disindayken infix method cagirimi yapilirsa this kullanilamaz.
fun logWhenImageDownloaded(imageUrl: String) {
    // logWhenImageDownloaded fonksiyonu class disinda oldugu icin (alttaki this) calısmaz.
    // this downloadImage imageUrl
}
