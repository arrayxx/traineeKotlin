/*
8. Создайте переменную lazyValue типа String, инициализируемую лениво.
Проверьте, что инициализация действительно происходит только
при первом обращении к переменной.
 */

// создаем ленивую переменную lazyValue
val lazyValue: String by lazy {
    println("Grasshoper is back again!")
    "if he HOP, what will you do then?"
}


fun main() {
    println(lazyValue)
    println(lazyValue)
}