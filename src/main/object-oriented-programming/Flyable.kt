/*
9. Создайте интерфейс Flyable с методом fly(), затем создайте классы Bird и Airplane,
реализующие этот интерфейс. Создайте объекты Bird и Airplane и вызовите их методы fly().
 */

// создадим интерфейс Flyable с абстрактным методом fly
interface Flyable {
    fun fly()
}

// создадим класс Bird, реализующий интерфейс Flyable
class Bird(): Flyable {
    // функция fly будет значиться, как простой вывод текста в консоль
    override fun fly() = println("Птица летит при помощи крыльев")
}

// создадим класс Airplane, реализующий интерфейс Flyable
class Airplane(): Flyable {
    override fun fly() = println("Самолет летит при помощи двигателя")
}

fun birdFly() {
    // создадим экземпляр класса Bird - birdFly
    val birdFly = Bird().fly()
}

fun airplaneFly() {
    // создадим экземпляр класса Airplane - airplaneFly
    val airplaneFly = Airplane().fly()
}

// вызовем оба экземпляра класса
fun main() {
    birdFly()
    airplaneFly()
}



