/*
10. Создайте коллекцию чисел и используйте fold или reduce
чтобы посчитать их сумму, минимальное и максимальное значения.
 */

// создадим функцию collectionOfNumbers
fun collectionOfNumbers(): String {
    // создадим список чисел
    val collectionOfNumbers = listOf(15, 200, 75, 66, 1)
    // посчитаем сумму чисел с помощью операции reduce
    val sumOfNumbers = collectionOfNumbers.reduce { acc, i ->  acc + i }
    // экстремумы списка выведем с помощью min и max, т.к. они оптимально подходят для данной задачи
    val minNumber = collectionOfNumbers.min()
    val maxNumber = collectionOfNumbers.max()
    // итог запишем в переменную по всем 3 вычислениям для наглядности
    val actionsResult = "Сумма чисел: $sumOfNumbers" + "\n" +
            "Минимальное число: $minNumber" + "\n" +
            "Максимальное число: $maxNumber"
    return actionsResult
}

fun main() {
    val collectionOfNumsResult = collectionOfNumbers()
    println(collectionOfNumsResult)
}