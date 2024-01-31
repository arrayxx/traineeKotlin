/*
9. Создайте функцию высшего порядка calculate, которая принимает два целых числа
и функцию операции. Продемонстрируйте использование calculate
с разными операциями (сложение, вычитание, умножение).
 */

// создадим лямбду, которая выводит строковое значение
// внутри строки реализуем математическое преобразование поданных на вход значений
val mathOperation: (Int, Int) -> String = {
    a: Int, b: Int -> "Сумма чисел $a и $b: ${a + b}\n" +
        "Разность чисел $a и $b: ${a - b}\n" +
        "Произведение чисел $a и $b: ${a * b}"
}

// функция высшего порядка calculate,
// которая производит три базовых действия с поданными на вход числами
fun calculate(a: Int, b: Int, mathOperation: (Int, Int) -> String) {
    println(mathOperation(a, b))
}

fun main() {
    val calculateResult = calculate(15, 25, mathOperation)
    println(calculateResult)
}

