import kotlin.math.max
import kotlin.random.Random

fun main() {
    // 1. выбрать максимальное число из двух
    fun maxOfTwo(a: Int, b: Int): Int {
        return if (a > b) {
            a
        } else {
            b
        }
    }

    val a = (0..100).random()
    val b = (0..100).random()
    println("сравнить числа $a и $b")
    println(maxOfTwo(a, b))

    // поиск большего числа из пары, для задания диапозона воспользуемся методом pair
    val pair1 = Pair(10, 50)
    val pair2 = Pair(0, -5)

    val maxValue1 = maxOfTwo(pair1.first, pair1.second)
    val maxValue2 = maxOfTwo(pair2.first, pair2.second)

    println("Максимальное число из пары $pair1: $maxValue1")
    println("Максимальное число из пары $pair2: $maxValue2")

    // 2. вывод имени по-умолчанию и именованного
    fun sayHello(name: String = "мир") {
        println(name)
    }

    sayHello()
    sayHello("Саша")

    // функция isGreater для сравнения чисел, пар чисел
    infix fun Int.isGreater(other: Int): Boolean {
        return this > other
    }

    val greaterNumber = 100 isGreater 5
    println("Число 100 больше 5?: $greaterNumber")
    val pairOfNumbers1 = Pair(11, 500)
    val pairOfNumbers2 = Pair(10000, -5)
    val greaterNumberInPairOne = pairOfNumbers1.first isGreater pairOfNumbers1.second
    val greaterNumberInPairTwo = pairOfNumbers2.first isGreater pairOfNumbers2.second
    println("Сравнение первой пары числе, 11 больше 500?: $greaterNumberInPairOne")
    println("Сравнение первой пары числе, 10000 больше -5?: $greaterNumberInPairTwo")

    // рекурсивная функция generateSequence
    tailrec fun generateSequence(n: Int, counter: Int = 0): Int {
        // остановка функции при достижении 0, иначе функция будет бесконечно вызывать саму себя
        if (n <= 0) {
            return counter
        }
        println(counter)
        return generateSequence(n - 1, counter + 1)
    }

    val sequenceResult = generateSequence(15)

    // функции let, apply, with, also, run
    val listOfNames = mutableListOf<String>("Кошка", "Жираф", "Бегемот", "Собака")

    listOfNames.let {
        it.add("Гиппопотам")
        val addedName = listOfNames[4]
        println("Добавили новое животное: $addedName")
    }

    // перевернем массив
    listOfNames.run {
        this.reverse()
        println(this)
    }

    // удалим один элемент из массива
    listOfNames.apply {
        remove(this[1])
        println(this)
    }

    // повторим 3 элемент массива несколько раз
    listOfNames.also {
        it[2] = it[2].repeat(3)
        println(it)
    }

    // проверка массива на пустоту
    with(listOfNames) {
        if (isEmpty()) {
            println("Массив пустой")
        } else {
            println("Массив не пустой и содержит имена: $this")
        }
    }

}