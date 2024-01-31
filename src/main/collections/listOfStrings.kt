package collections

/*
Создайте список строк [“один”, “два”, “три”, “четыре”, “пять”].
Используйте map чтобы получить длину каждого элемента списка.
 */

fun listOfStrings() {
    // создадим список строк
    val listOfStrings = listOf("один", "два", "три", "четыре", "пять")
    // с помощью метода map вызовем длину элемента списка length
    println(listOfStrings.map { it.length })
}

fun main() {
    listOfStrings()
}