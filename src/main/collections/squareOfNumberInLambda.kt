/*
4. Создайте лямбда-функцию, которая принимает число и возвращает его квадрат.
Используйте эту лямбда-функцию в другой функции, которая принимает число
и возвращает строку, состоящую из числа и его квадрата (например, “5 и его квадрат равен 25”).
 */

// создадим лямбу, которая принимает целое число и возвращает его квадрат
val squareOfNumber = { a: Int -> a*a }

// создадим функцию, которая принимает целое число и передает его в нашу лямбду squareOfNumber
fun squareOfNumberResult(a: Int, squareOfNumberCalc: (Int) -> Int): String {
    // присвоим вычисление переменной, чтобы в выводе было число, а не его тип
    val squareNumberResult = squareOfNumberCalc(a)
    return "Квадрат числа $a равен $squareNumberResult"
}

fun main() {
    val squareOfNumberResult = squareOfNumberResult(10, squareOfNumber)
    println(squareOfNumberResult)
    // проверим, что наша переменная squareOfNumberResult является строкой
    println(squareOfNumberResult::class.java.typeName)
}