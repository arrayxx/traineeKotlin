/*
8. Создайте абстрактный класс Shape с абстрактным методом area(),
затем создайте классы Circle и Rectangle, реализующие этот метод.
Создайте объекты Circle и Rectangle и выведите их площадь.
 */

/*
импортируем число пи из модуля math стандартной библиотеки джавы.
Используем джаву, потому что kotlin все равно переводит все
при компиляции в байт-код JVM, такой импорт ускорит работу программы
 */
import java.lang.Math.PI

fun main() {
    // создадим абстрактный класс Shape, у которого есть абстрактный метод area
    abstract class Shape {
        abstract fun area(): Double
    }

    // создадим дочерний класс Circle
    // в конструкторе добавим переменную радиус
    // площадь считается по формуле пи*радиус в квадрате
    class Circle(private val r: Double): Shape() {
        override fun area(): Double = PI * r*r
    }

    // cоздадим дочерний класс Rectangle
    // в конструкторе добавим две переменные - длину и ширину
    // площадь считается по формуле длина*ширина
    class Rectangle(
        private val length: Double,
        private val width: Double): Shape() {
        override fun area(): Double = length * width
    }

    fun circleArea() {
        // внутри функции создадим объект класса Circle
        val circleArea = Circle(r = 5.0).area()
        println(circleArea)
    }

    fun rectangleArea() {
        // внутри функции создадим объект класса Rectangle
        val rectangleArea = Rectangle(10.0, 3.5).area()
        println(rectangleArea)
    }

    // вызовем объекты классов Circle и Rectangle
    circleArea()
    rectangleArea()
}
