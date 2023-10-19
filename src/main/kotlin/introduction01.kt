import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello, world!")
    val numeric = 10
    val string = "тест1"
    val boolean = true
    println("У нас есть разные типы переменных: целочисленные - $numeric, строковые - $string, булевы - $boolean")
    val arithmeticValue = (12 + 4) - 4
    println("пример арифметического вычисления: (12 + 4) - 4 = $arithmeticValue")
    // зададим массив чисел
    val arrayOfNumbers = arrayOf(1, 2, 15, 77, 12, 23, -5)
    // установим выбор случайного числа из массива arrayOfNumbers с помощью модуля Random
    val comparisonNumber1 = Random.nextInt(arrayOfNumbers.size)
    val comparisonNumber2 = Random.nextInt(arrayOfNumbers.size)
    // сравним числа, выбранные случайным образом из массива arrayOfNumbers
    if (comparisonNumber1 < comparisonNumber2) {
        println("число $comparisonNumber1 меньше числа $comparisonNumber2")
    } else {
        println("число $comparisonNumber1 больше числа $comparisonNumber2")
    }
    println("Введите свое имя: ")
    val userName = readLine().toString()
    val result = nameOutput(userName)
    println(result)
}

fun nameOutput(userName: String): String {
    val welcomeText = "Добро пожаловать, $userName!"
    return welcomeText
}

