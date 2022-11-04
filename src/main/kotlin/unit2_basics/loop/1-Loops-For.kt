package unit2_basics.loop

fun main() {

    /**
     *    3 farkli sekilde for tanimlayabilirsiniz.
     *    value in list                       seklinde value degerlerini alabilirsiniz.
     *    index in list.indices               seklinde index degerlerini alabilirsiniz.
     *    (index,value) in list.withIndex()   seklinde index,value degerlerini alabilirsiniz.
     * **/

    for (value: Int in 1..10) {
        print("$value ")
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")

    for (value in countryCodeArray) {
        print("$value ")
    }

    for (index in countryCodeArray.indices) {
        print("\n$index . değeri : ${countryCodeArray[index]} ")
    }

    for ((index, value) in countryCodeArray.withIndex()) {
        print("\n$index . değer : $value ")
    }

    /*
    countryCodeArray.withIndex().forEach { iterable ->
        iterable.index
        iterable.value
    }
    */


    /* -------------------------------------------------------------------------------------------------------------------*/


    /**
     *    repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlayan isler yapabilirsiniz.
     * **/

    repeat(10) {
        print("\n$it. Daha çok blog yazmam lazım!")
    }


    /* -------------------------------------------------------------------------------------------------------------------*/


    /**
     *    return kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     *    continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devam edebilirsiniz.
     * **/

    print("\n\n")

    for (value in 1..50) {
        if (value % 2 == 1) {
            continue
        }
        print("$value  ")
    }

    print("\n\n")

    for (value in 1..50) {
        if (value % 19 == 0) {
            break
        }
        print("$value  ")
    }

    print("\n\n")


    /**
     *      Iç içe for donguleri kullaniyorsak bir ustteki for'a degil de iki ustteki uc ustteki for'a donmek istiyorsak label kullanabiliriz.
     *      bunun icin labelname@ ifadesini ilgili for'un onune yazip,
     *      return ya da continue yapacagimiz yere ise @labelname seklinde yazmamiz yeterlidir.
     * **/

    print("\ncontinue1 :\n")

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 % 5 == 0) {
                continue
            }

            print("$value:$value2  ")
        }
    }

    print("\n\n")

    print("\ncontinue2 :\n")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }

            print("$value:$value2  ")
        }
    }

    print("\n\n")

    print("\nbreak1 :\n")

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break
            }

            print("$value:$value2  ")
        }
    }

    print("\n\n")

    print("\nbreak2 :\n")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..100) {
            if (value2 == 20) {
                break@returnLabel
            }

            print("$value:$value2  ")
        }
    }
}