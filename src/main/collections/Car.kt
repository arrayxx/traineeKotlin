/*
7. Создайте класс Car с полями make, model и year. С
оздайте коллекцию из нескольких объектов этого класса
и используйте groupBy чтобы сгруппировать машины по году выпуска.
 */

// cоздадим дата-класс с полями для описания машин
data class Car(val make: String, val model: String, val year: Int) {
}

// создадим функцию, внутри которой формируется коллекция объектов Car
fun listOfCars() {
    val listOfCars = listOf(
        Car("Toyota", "Camri", 2005),
        Car("Nissan", "Skyline", 2008),
        Car("Ferrari", "F40", 2000),
        Car("Zeekr", "001", 2023),
        Car("Rolls-Royce", "Phantom extended", 2020)
    )
        // применим функцию сортировки по возрастанию, затем фильтрацию по году
        .sortedBy { it.year }
        .groupBy { it.year }

    println(listOfCars)
}

fun main() {
    val filteringCarsResult = listOfCars()
}
