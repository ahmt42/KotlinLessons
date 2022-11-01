package p2_basics.loop

fun main() {

    /**
     *    Diger dillerde nasil kullaniyorsak Kotlin'de de ayni sekilde kullaniyoruz.
     *    Eger bir donguye ihtiyaciniz varsa ve bu dongu sirasinda if else ile bir sartli duruma ihtiyaciniz varsa, bu durumda;
     *    for + if else kullanmak yerine while kullanabilirsiniz.
     * **/

    var number = 0

    while (number < 5) {
        print("${number++} , ")
    }

    while (number < 5) {
        print("$number , ")
        number++
    }

    print("\n")

    for (value in 0..110) {
        if (value < 5) {
            print("$value , ")
        } else {
            return
        }
    }
}