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
    if (a == null) {
        a = "There is null"
    }
    // Not-null можно вызвать явным образом, но в данном случае это не обязательно,
    // так как в цикле уже присвоено знаечние для a
    println(a!!.length)
}