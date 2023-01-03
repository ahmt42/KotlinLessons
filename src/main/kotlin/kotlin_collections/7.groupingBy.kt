package kotlin_collections


data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 25), Person("Bob", 31), Person("Charlie", 31))

    val peopleByAge = people.groupingBy { it.age }
    val peopleByAge2 = people.groupBy { it.age }
    println(peopleByAge2)  // Output: {25=[Person(name=Alice, age=25)], 31=[Person(name=Bob, age=31), Person(name=Charlie, age=31)]}
}
