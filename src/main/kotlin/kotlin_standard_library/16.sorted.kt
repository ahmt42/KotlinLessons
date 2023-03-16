


fun main() {
    val unsortedList = listOf("orange", "apple", "banana", "kiwi")
    val sortedList = unsortedList.sorted()
    val sortedDescendingList = unsortedList.sortedDescending()

    println(sortedList) // [apple, banana, kiwi, orange]
    println(sortedDescendingList ) // [orange, kiwi, banana, apple]
}