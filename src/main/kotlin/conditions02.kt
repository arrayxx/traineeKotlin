fun main(args: Array<String>) {
    // 1. условные операторы
    fun conditionCheck(userInput: Int): Int {
        if (userInput == 0) {
            println("Ваше число нейтрально")
        } else if (userInput > 0) {
            println("Ваше число положительное")
        } else {
            println("Ваше число отрицательное")
        }
        return userInput
    }
    println("Введите ваше число: ")
    val inputNumber = readln().toInt()
    var userInput = conditionCheck(inputNumber)

    // 2. Циклы
    fun squareNumbers(inputArray: IntArray) {
        // ицкл for для перебора по массиву чисел
        for (i in inputArray) {
            // считаем квадрат числа без pow
            val perfectSquere = i * i
            // проверка числа массива на 1
            if (i == perfectSquere) {
                println("Квадрат числа $i равен самому себе")
            } else {
                println("Квадрат числа $i равен $perfectSquere")
            }
        }
        // запишем итератор в переменную index для прохождения цикла
        val index = inputArray.asList().iterator()
        // цикл движется вперед по индексам массива до конца
        // для задания полного интервала используем метод hasNext
        while (index.hasNext()) {
            // создадим переменную для хранения итератора
            // при выводе оно будет печататься как обычное число Int
            val iterator =  index.next()
            // считаем куб без pow
            val cubeOfNumber = iterator * iterator * iterator
            println("куб числа $iterator равен $cubeOfNumber")
        }
    }
    // произвольный массив чисел
    val inputArray = intArrayOf(1, 2, 9, 15, -5, 66, -10, 8, 9, 11)
    squareNumbers(inputArray)

    // 3. функция повторения, в скобках указываем количество повторений
    repeat(10) {
        println("Привет, мир!")
    }

    // 4. Return, Break, Continue

    fun sumOfNumbers(arrayOfNumbers: IntArray): Int {
        var count = 0
        for (i in arrayOfNumbers) {
            if (i > 10) {
                count += i
            } else if (i < 0) {
                return count
            }
        }
        return count
    }

    val arrayOfNumbers = intArrayOf(2, 25, 15, 700, 0, 11, 5, 50, 10)
    val sum = sumOfNumbers(arrayOfNumbers)
    println("Сумма чисел равна: $sum")

    print("Ряд числел от 1 до 10 без цифр 3 и 7: ")
    for (i in 1..10) {
        if (i == 3 || i == 7) {
            continue
        }
        if (i != 10) {
            print("$i, ")
        } else {
            print("$i")
        }
    }

    // индусский код, чтобы перенести строку
    println()
    // поиск суммы до 50
    var count = 0
    for (i in 10..99) {
        count += i
        if (count > 50) {
            println("Сумма текущих чисел превышает 50: $count")
            break
        }
    }

    // ошибка формата ввода
    try {
        println("Введите целое число:")
        val inputException: Int = readln().toInt()
        println("Число корректное и равно $inputException")
    } catch (e: NumberFormatException) {
        println("Вы используете текст для ввода! Используйте число")
    } finally {
        println("Конец программы")
    }

    // деление на ноль
    val numerator = 10
    val denominator = 0

    try {
        val result = numerator / denominator
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Ошибка: деление на ноль")
        e.printStackTrace()
    }
    println("Конец программы")


}
