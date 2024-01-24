/*
3. Напишите функцию высшего порядка, которая принимает два параметра:
целое число и функцию, принимающую целое число и возвращающую строку.
Эта функция должна преобразовывать число в строку с помощью переданной функции
и возвращать результат
 */

// создадим лямбда-выражение, конвертирующее число в строку
val lambdaToStringReturn = { a: Int -> a.toString() }

// создадим функцию, которая принимает на вход число и передает его в лямбда-выражение
fun higherOrderFunction(b: Int, lambda: (Int) -> String): String {
    return lambda(b)
}

fun main() {
    val higherOrderFunResult = higherOrderFunction(150, lambdaToStringReturn)
    println(higherOrderFunResult)
    // убедимся, что функция действительно возвращает строковый тип данных
    println(higherOrderFunResult::class.java.typeName)
}