/*
11. Создайте sealed class MathOperation и несколько объектов, представляющих различные
математические операции (например, Add, Subtract, Multiply, Divide). Создайте функцию,
которая принимает MathOperation и два числа, и выполняет соответствующую операцию.
 */


// зададим ограниченный класс MathOperation
sealed class MathOperation() {
    // создадим синглтон Subtract
    object Subtract: MathOperation() {
        // внутри объекта определим функцию для выполнения вычитания
        // функция принимает числа a и b, возвращает Int
        fun subtract(a: Int, b: Int): Int = a - b
    }
    // создадим синглтон Divide
    object Divide: MathOperation() {
        /*
        внутри объекта определим функцию для выполнения вычитания
        функция также принимает два числа a и b,
        т.к. возможна ситуация, когда у нас b = 0, то добавим обработку исключения
        деления на ноль через конструкцию try - catch
        */
        fun divide(a: Int, b: Int): Int {
            // поменял try - catch на throw
            // действительно, при такой конструкции Int не обязательно проверять на Null
            if (b == 0) {
                throw ArithmeticException("Деление на ноль!")
            }
            return a/b
        }
    }
}

// функция main для вызова операций вычитания и деления
fun main() {
    // создаем переменную, выполняющую операцию вычитания с первой парой чисел
    val pairOfNumbers1 = MathOperation.Subtract.subtract(1532823, 201202)
    // создаем переменную, выполняющую операцию деления для второй пары чисел
    val pairOfNumbers2 = MathOperation.Divide.divide(1000, 0)
    println(pairOfNumbers1)
    println(pairOfNumbers2)
}