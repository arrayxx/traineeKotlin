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


}