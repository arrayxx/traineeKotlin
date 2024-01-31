/*
1. Вам дан код: val a: String? = null. Каковы способы,
которыми вы можете обратиться к a без вызова исключения NullPointerException?
 */


fun nullSafety(): String? {
    val a: String? = null
    return a
}


fun main() {
    var a = nullSafety()
    // с помощью оператора ?
    a?.length
    // с помощью оператора elvis ?: <значение>
    a?.length ?: 0
    // с помощью оператора !!
    a = a ?: "There is null"
    println(a.length)
}