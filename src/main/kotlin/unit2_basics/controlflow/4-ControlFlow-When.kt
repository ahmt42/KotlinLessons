package unit2_basics.controlflow

fun main() {

    /**
     *    switch case'lerin yerine gelmistir.
     *    when(karsilastirilacak_ifade)
     *        value -> {}
     *        value -> {}
     *        else -> {}
     *    formatiyla kullanilir.
     *    Yine {} arasina tek satir kod yazilacaksa bu durumda {}'leri kullanmayabilirsiniz.
     *    "tr", "az" gibi ayni kodu calistiracak case'ler varsa araya virgul koyarak kullanabiliriz.
     *    Bu "veya" kullanimi yapmayi saglar. "tr veya az" gibi.
     * **/

    val countryCode = readLine()!!
    when (countryCode.lowercase()) {
        "tr", "az" -> println("Türk Vatandaşı")
        "ar" -> println("Arab Vatandaşı")
        "fr" -> println("Fransa Vatandaşı")
        "ru" -> println("Rusya Vatandaşı")
        "uk" -> println("İngiltere Vatandaşı")
    }

    //TODO("bakılacak")
    /*
    when (countryCode.toInt()) {
        3.and(5) -> println("Türk Vatandası")
        1 or 2 -> println("TC Vatandası")
    }
    */


    /* -------------------------------------------------------------------------------------------------------------------*/


    /**
     *     when'in yanina karsilastirma ifadesi eklemeden, bunu case'lerin yanina da ekleyebilirsiniz.
     *     Bunun artisi && || and or xor gibi ifadeleri de kullanabilmenizi saglar.
     * **/
    
    when {
        countryCode.lowercase() == "tr" || countryCode.lowercase() == "az" -> println("Türk Vatandası")
        countryCode.lowercase() == "ar" -> println("Arab Vatandası")
        countryCode.lowercase() == "fr" -> println("Fransa Vatandaşı")
        countryCode.lowercase() == "ru" -> println("Rusya Vatandaşı")
        countryCode.lowercase() == "uk" -> println("İngiltere Vatandaşı")
    }

    if (countryCode.lowercase() == "tr" || countryCode.lowercase() == "az")
        println("Türk Vatandası")
    else if (countryCode.lowercase() == "ar")
        println("Arab Vatandaşı")
    else if (countryCode.lowercase() == "fr")
        println("Fransa Vatandaşı")
    else if (countryCode.lowercase() == "ru")
        println("Rusya Vatandaşı")
    else if (countryCode.lowercase() == "uk")
        println("İngiltere Vatandaşı")

    
    /* ------------------------------------------------------------------------ */

    
    /**
     *     Expression kullanimini if else'lerde oldugu gibi when'lerde de yapabilirsiniz.
     * **/
    
    var countryCode2: String = if (countryCode.lowercase() == "tr" || countryCode.lowercase() == "az") {
        println("Turki Vatandası")
        "90"
    } else if (countryCode.lowercase() == "ar") {
        println("Arab Vatandası")
        "80"
    } else if (countryCode.lowercase() == "fr") {
        println("France Vatandası")
        "60"
    } else if (countryCode.lowercase() == "ru") {
        println("Russian Vatandası")
        "50"
    } else if (countryCode.lowercase() == "uk") {
        println("United Kingdom Vatandası")
        "40"
    } else {
        "30"
    }

    countryCode2 = when (countryCode.lowercase()) {
        "tr", "az" -> {
            println("TC Vatandası")
            "90"
        }
        "ar" -> {
            println("Arab Vatandası")
            "80"
        }
        "fr" -> {
            println("France Vatandası")
            "70"
        }
        "ru" -> {
            println("Russian Vatandası")
            "60"
        }
        "uk" -> {
            println("United Kingdom Vatandası")
            "50"
        }
        else -> {
            "40"
        }
    }

    countryCode2 = when {
        countryCode.lowercase() == "tr" || countryCode.lowercase() == "az" -> {
            println("TC Vatandası")
            "90"
        }
        countryCode.lowercase() == "ar" -> {
            println("Arab Vatandası")
            "80"
        }
        countryCode.lowercase() == "fr" -> {
            println("France Vatandası")
            "70"
        }
        countryCode.lowercase() == "ru" -> {
            println("Russian Vatandası")
            "60"
        }
        countryCode.lowercase() == "uk" -> {
            println("United Kingdom Vatandası")
            "50"
        }
        else -> {
            "40"
        }
    }

    println("countryCode2 : " + countryCode2)


    /* -------------------------------------------------------------------------------------------------------------------*/

    //karsilastirilacak sey "deger" yerine "degisken" de olabilir.
    val trCode = "tr"
    val arCode = "ar"
    val frCode = "fr"
    val ruCode = "ru"
    val ukCode = "uk"
    when (countryCode.lowercase()) {
        trCode, "az" -> println("TC Vatandası")
        arCode -> println("Arab Vatandası")
        frCode -> println("France Vatandası")
        ruCode -> println("Russian Vatandası")
        ukCode -> println("United Kingdom Vatandası")
    }


    /* -------------------------------------------------------------------------------------------------------------------*/


    // is !is ile bir class'in referansi olunup olunmadigi kontrolu yapilabilir.
    val phoneNumber: Long = 5554443322
    when (phoneNumber) {
        is Long -> {
            println("Long value")
        }
        !is Long -> {
            println("Long value degil")
        }
    }


    /* -------------------------------------------------------------------------------------------------------------------*/


    // range'leri in !in seklinde kontrolu yapilabilir.
    val number = 3
    when (number) {
        in 0..10 -> {
            println("0 ile 10 arasında")
        }
        in 11..20 -> {
            println("11 ile 20 arasında")
        }
        !in 11..20 -> {
            println("11 ile 20 arasında değil")
        }
    }
}