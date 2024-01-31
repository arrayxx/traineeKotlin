/*
10. Создайте коллекцию чисел и используйте fold или reduce
чтобы посчитать их сумму, минимальное и максимальное значения.
 */

// создадим функцию collectionOfNumbers
fun collectionOfNumbers(): String {
    // создадим список чисел
    val collectionOfNumbers = listOf(15, 200, 75, 66, 1, 12)
    // посчитаем сумму чисел с помощью операции reduce
    val sumOfNumbers = collectionOfNumbers.reduce { acc, i ->  acc + i }
    // экстремумы списка выведем с помощью fold
    val minNumber = collectionOfNumbers.fold(DEFAULT_BUFFER_SIZE) { min, a -> if (a < min) a else min }
    val maxNumber = collectionOfNumbers.fold(0) { max, a -> if (a > max) a else max }
    // итог запишем в переменную по всем 3 вычислениям для наглядности
    val actionsResult = "Сумма чисел: $sumOfNumbers\n" +
            "Минимальное число: $minNumber\n" +
            "Максимальное число: $maxNumber"
    return actionsResult
}

fun main() {
    val collectionOfNumsResult = collectionOfNumbers()
    println(collectionOfNumsResult)
}
