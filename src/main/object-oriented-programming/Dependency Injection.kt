/*
13. Создайте классы Engine и Tires. Затем создайте класс Car,
который получает Engine и Tires через конструктор (Dependency Injection).
 */


// создадим класс двигателя с методом start
class Engine {
    fun start() = println("A car is getting started...")
}

// создадим открытый класс Шины с методом seasonalTires
// класс открыт, т.к. шины могут быть зимние/летние и тут возможно переопределение значения функции
open class Tires {
    open fun seasonalTires() = println("A car has season tires..." )
}

/* создадим класс Car с двумя приватными полями engine и tires
поля отражают использование принципа dependency injection
мы используем оба класса Engine/Tires внутри Car, но не используем явное наследование
каждое поле использует тип своего класса Engine, либо Tires
 */
class Car(private val engine: Engine, private var tires: Tires) {
    // создадим функцию carComponents, внутри которой переопределим tires
    fun carComponents() {
        tires = object: Tires() {
            override fun seasonalTires() = println("A car has winter tires")
        }
        // вызовем метод start класса Engine и метод seasonalTires класса Tires
        engine.start()
        tires.seasonalTires()
    }
}

// точка входа в программу
fun main() {
    // создадим переменную car, которая вызывает класс Car
    val car = Car(Engine(), Tires())
    car.carComponents()
}