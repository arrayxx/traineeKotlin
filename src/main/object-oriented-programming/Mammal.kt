/*
12. Создайте два класса: Mammal и CanFly. В классе Mammal определите метод breastfeed(),
а в классе CanFly - метод fly(). Затем создайте класс Bat,
который сочетает в себе оба этих поведения (с помощью композиции).
 */

// создадим класс Mammal с методом breastfeed
open class Mammal {
    // метод возвращает строку can breastfeed
    open fun breastfeed(): String { return "can breastfeed" }
}

// создадим класс CanFly с методом fly
open class CanFly {
    // метод возвращает строку can't fly, т.к. в базе млекопитающие не умеют летать
    open fun fly(): String { return "can't fly" }
}

/* создадим класс Bat с двумя полями конструктора
private val mammal принимает тип Mammal
private val canFl принимает тип CanFly
переопределяем функцию toString внутри Bat,
чтобы в выводе была строка со значением, а не тип значения
 */
class Bat(private val mammal: Mammal, private val canFly: CanFly) {
    override fun toString(): String {
        return "Bat ${mammal.breastfeed()} and ${canFly.fly()}"
    }
}

// точка входа в программу
// в поле mammal передаем класс Mammal
// в поле canFly передаем синглтон CanFly
fun main() {
    val mammal = Mammal()
    // создадим объект-выражение от класса CanFly
    // внутри объекта переопределим функцию fly
    val canFly = object : CanFly() {
        // летучая мышь умеет летать...
        override fun fly(): String { return "can fly" }
    }

    /* выведем наш класс Bat внутри переменной bat
    теперь класс содержит как метод breastfeed из класса Mammal
    так и переопередляет метод fly из класса CanFly
     */
    val bat = Bat(mammal, canFly)
    println(bat)
}
