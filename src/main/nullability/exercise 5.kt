/*
5. Создайте пользовательское исключение InvalidUserInputException,
которое выбрасывается, когда пользователь вводит что-то неверное.
Покажите, как его можно перехватить и обработать.
 */

// создадим кастомный класс InvalidUserInputException, который наследуется от Exception
class InvalidUserInputException(YouDoItWrong: String): Exception(YouDoItWrong) {
}

// создадим функцию, которая выбрасывает InvalidUserInputException с заданным текстом
fun errorMessage() {
    throw InvalidUserInputException("у null не может быть длины!")
}

fun main() {
    // создадим переменную a, которая по умолчанию имеет null
    val a: String? = null
    // добавим обработчик исключений
    try {
        // если a = null, то нужно выводить сообщение из нашего исключения InvalidUserInputException
        a?.length ?: errorMessage()
    } catch (e: InvalidUserInputException) {
        println("Ошибка ввода: ${e.message}")
    }
}