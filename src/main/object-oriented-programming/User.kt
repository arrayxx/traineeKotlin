/*
10. Создайте data class User с двумя свойствами и методом printInfo(),
который выводит информацию о пользователе.
Создайте объект User и вызовите его метод printInfo().
 */

// создадим дата-класс User, который принимает на вход два свойства
data class User(val userName: String, val age: Int) {
    fun printInfo() {
        println("Вас зовут $userName, ваш возраст - $age")
    }
}

// функция main для вызова информации о пользователе
fun main() {
    val user1 = User("Саша", 24)
    user1.printInfo()
}