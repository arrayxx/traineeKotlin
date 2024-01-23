///*
//13. Создайте классы Engine и Tires. Затем создайте класс Car,
//который получает Engine и Tires через конструктор (Dependency Injection).
// */

// создадим класс двигателя с методом start
class Engine {
    fun start(): String = "A car is getting started..."

    // переопределим функцию toString, чтобы распечатывалось значение объекта, а не его тип
    override fun toString(): String {
        return start()
    }
}


interface Tires {
    fun getTires(): String
}


class WinterTires: Tires {
    override fun getTires(): String { return "Winter tires are installed" }
}

class SummerTires: Tires {
    override fun getTires(): String { return "Summer tires are installed" }
}

class Car(private val engine: Engine, private val tires: Tires) {
    fun carComponents() {
        println(engine)
        println(tires.getTires())
    }
}

fun main() {
    // создадим переменную car, которая вызывает класс Car
    val carInWinterTire = Car(Engine(), WinterTires())
    val carInSummerTires = Car(Engine(), SummerTires())
    carInWinterTire.carComponents()
    carInSummerTires.carComponents()
}