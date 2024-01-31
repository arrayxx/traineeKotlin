/*
3. Вам дан код: var s: String? = null. Преобразуйте его в ненулевое значение
с помощью оператора elvis, чтобы вместо null было значение "empty".
 */


var a: String? = null


fun main() {
    val b = a ?: "empty"
    println(b)
}