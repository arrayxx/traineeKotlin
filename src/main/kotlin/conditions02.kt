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

    fun sumOfNumbers(arrayOfNumbers: IntArray) {
        for (i in arrayOfNumbers) {
            if (i == 0) {
                return
            }
            if (i > 10 ) {
                val sumOfNumbers = i+i
                println("Сумма чисел до 10: $sumOfNumbers")
            }
        }
    }

    val arrayOfNumbers = intArrayOf(2, 2, 1, 0)
    sumOfNumbers(arrayOfNumbers)
}
