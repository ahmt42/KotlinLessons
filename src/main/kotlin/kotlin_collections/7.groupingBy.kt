package kotlin_collections

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(Person("Alice", 25), Person("Bob", 31), Person("Charlie", 31))

    val peopleByAge = people.groupingBy { it.age }
    val peopleByAge2 = people.groupBy { it.age }
    println(peopleByAge.eachCount())
    println(peopleByAge2)  // Output: {25=[Person(name=Alice, age=25)], 31=[Person(name=Bob, age=31), Person(name=Charlie, age=31)]}

    //

    data class Task(val name: String, val completed: Boolean)

    val tasks = listOf(
        Task("Take out the trash", true),
        Task("Do homework", false),
        Task("Watch TV", true),
        Task("Go to the gym", false),
        Task("Go to the cinema", true)
    )

    val taskByStatusCount = tasks.groupingBy { it.completed }.eachCount()
    val taskByStatus = tasks.groupBy ({ it.completed }, { it.name })

    println(taskByStatusCount)
    println(taskByStatus)

}
