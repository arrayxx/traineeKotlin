/*
Создайте список чисел от 1 до 10, затем используйте метод filter
чтобы оставить только четные числа.
После этого используйте метод map чтобы умножить каждое число на 2.
 */

// создаем функцию evenNumbers
fun evenNumbers() {
    // создадим две переменные - listOfDigits содержит коллекцию чисел от 1 до 10
    // evenDigits - отфильтрованный список по четным числам
    // с помощью метода map умножим каждое число на 2
    val listOfDigits = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenDigits = listOfDigits.filter { it % 2 == 0 }.map { it * 2 }
    println(evenDigits)
}

fun main() {
    evenNumbers()
}