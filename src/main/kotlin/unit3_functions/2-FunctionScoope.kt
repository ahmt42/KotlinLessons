package unit3_functions

/**
 *    Bir fonksiyon herhangi bir sinifin icerisinde degil de bir dosyasinin icersinde boslukta tanimlaniyorsa, top level function adini alir.
 *
 *    Bir fonksiyon olusturulurken top level tanimlama yapilamiyor, sadece bir sinifa ait fonksiyonlar yazilabiliyorsa, bunlara fonksiyon degil, method denir.
 *    Bir fonksiyona fonksiyon diyebilmeniz icin top level tanimlanabiliyor olmasi lazim.
 * **/

fun main() {
    calculateAtomPhysics()
}

/**
 *    Fonksiyon icersinde fonksiyon tanimi kotlin'de yapilabir. Bu fonksiyonlara Local Functions denir. (yazdiginiz fonksiyonun kendi sinifinizdan dahi cagrilmasini istemeyebilirsiniz)
 *    Bu fonksiyonunun herhangi bir baska fonksiyon ya da sinif icin degistirilmesini istemeyebilirsiniz. (private)
 *    Reflection ile fonksiyonlariniz erisilirken gizli kalsin isteyebilirsiniz.
 *    Bu gibi durumlarda bu cok onemli fonksiyonunuzu baska bir fonksiyon icerisine yazabilirsiniz.
 * **/

fun calculateAtomPhysics() {

    val userName = "Codemy"
    println("Initialize Process...")

//    val numberOne = readLine()!!.toInt()
//    val numberTwo = readLine()!!.toInt()
//    val result = numberOne + numberTwo
//    println("$result")
//
//    val numberThree = readLine()!!.toInt()
//    val numberFour = readLine()!!.toInt()
//    val result2 = numberOne + numberTwo
//    println("$result2")

    // bu fonksiyona sadece calculateAtomPhysics içerisinde erişebiliriz.
    fun getValuesFromUserAndPrint() {
        userName.length
        val numberOne = readLine()!!.toInt()
        val numberTwo = readLine()!!.toInt()
        val result = numberOne + numberTwo
        println("$result")
    }

    getValuesFromUserAndPrint()

    println("Process has been done")
}

/**
 *      Bir sinifin icersindeki fonksiyonlara, uye fonksiyonlar denir.
 * **/
class Car {
    fun setColor(colorCodeId: Int) {

    }
}


/**
 *      Bir fonksiyon Generic tip aliyorsa, Generic Function olarak adlandirilir.
 * **/
fun <T> setColor(colorCodeId: T) {

}
