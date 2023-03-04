data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Ahmet", 30),
        Person("Mehmet", 5),
        Person("Ayşe", 15),
        Person("Fatma", 20),
        Person("Esra", 25)
    )

    // Filter people older than 30
    val olderPeople = people.filter { it.age > 18 }

    println("People older than 30:")
    olderPeople.forEach { println(it.name) }
}
