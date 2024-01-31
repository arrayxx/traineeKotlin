/*
5. Создайте объект класса Person со свойствами name и age.
Создайте список из нескольких таких объектов.
Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
 */

// создадим дата-класс с полями имя и возраст
data class Person(val name: String = "", val age: Int = 0) {
}

// создадим функцию, которая содержит список объектов класса Person
fun personListIterator(): List<String> {
    val personList = listOf(
        Person("Саша", 23),
        Person("Гачи", 17),
        Person("Василиса", 16),
        Person("Гаджи", 45),
        Person("Клавдия", 19),
        Person("Крюгер", 18)
    )

    // создадим переменную, которая содержит отфильтрованные объекты списка людей по параметрам:
    // возраст больше 18, выводить только имя человека
    val filteringListOfPersons = personList.filter { it.age > 18 }.map { it.name }

    return filteringListOfPersons
}

fun main() {
    val resultOfFiltering = personListIterator()
    println(resultOfFiltering)
}