package kekod.unit4_classes

class Car constructor( val wheelCount: Int, val color: String = "Red") { //primary const. constructor yazmamiza gerek yok // visibility modifier veya jvm annotation verilecekse constructor yazmak zorundayiz.
    private val mWheelCount: Int //parametreleri yukarda const. icindede val var yazarak tanimlayabilirz.
    private val mColor = color

    //wheelCount  boyle erismek icin primary const. icinde val veya var ile  lazim

    /**
     * initler constructorlarla beraber calisir ama secondary lerden once calisir,
     * bekledigi parametreleri verirsem hep init calisacak.
     * Harici primaryde bulunmayan baska parametre veriyorsam yine init calisir
     * ama devaminda hangi const uygun parametre verildiyse o calisacak.
     *
     * kotlinde butun secondary const. lar mecburen primary i isaret etmelidir. this ile yapiyourz. miras aliyor gibi
     * primaryde constructor bos verilmisse  secondary constructorlara this yazmaya gerek yoktur.
     */

    init {
        mWheelCount = wheelCount
        "primary const. created".printLog()
        "WheelCount: $mWheelCount, Color: $mColor.printLog()"
    }

    constructor(name: String) : this(4) {             //parametreleri farkli olan secondary const. lar boyle olusturulur.
        "1. secondary const. created".printLog()
    }

    constructor(name: String, madeOf: String) : this(4) {  //secondary const. lar olustururken this ile primary const. isaret etmeliyiz.
        "2. secondary const. created".printLog()
    }


}

fun main() {
    val car0 = Car(4) //car0 nesnesini Car classindan olusturduk
    val car1 = Car(4, "blue")
    val car2 = Car("blue", "Metal")
    val car3 = Car("Ferrari")

}

fun String.printLog(){
    println(this)
    println("--------------------")
}