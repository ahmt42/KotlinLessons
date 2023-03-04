fun main() {
    val people = listOf(
        Person("Ahmet", 30),
        Person("Mehmet", 5),
        Person("Ayşe", 15),
        Person("Fatma", 20),
        Person("Esra", 25)
    )

    // Convert people to a list of names
    val names = people.map { it.name.uppercase() }

    println("Names:")
    names.forEach { println(it) }
}