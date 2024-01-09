/*
14. Создайте обобщенный интерфейс Repository<T>, который содержит методы для сохранения
(save(item: T)), удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 */

// создаем интерфейс Repository с обобщенным типом T
interface Repository<T> {
    // все методы интерфейса также возвращают некий тип T
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

// создадим класс UserRepository, который также имеет обобщенный тип
class UserRepository<T>: Repository<T> {
    // зададим пустой список типа T, в который будем добавлять вещи
    // список далее потребуется для реализации метода getAll()
    private val items = mutableListOf<T>()
    override fun save(item: T) {
        // добавляем вещь в список items
        items.add(item)
        println("Предмет добавлен: $item")
    }
    override fun delete(item: T) {
        // удалим предмет из списка items
        items.remove(item)
        println("Уберите предмет $item из своего чемодана!")
    }
    override fun getAll(): List<T> {
        // выведем итоговый список items
        return items
    }

}

// создадим класс User_ и инициализируем внутри
class User_ {
    // пропишем инициализатор для вызова наших методов
    init {
        // проверяем, что наш класс и его методы могут принимать разные типы данных
        // первым проверяем целое число
        val item1 = UserRepository<Int>()
        item1.save(100000)
        // небольшой сценарий, чтобы показать, что методы delete и getAll работают
        val item2 = UserRepository<String>()
        item2.delete("100000 тенге")
        val item3 = UserRepository<String>()
        item3.save("дорожная карта")
        item3.save("100000 рублей")
        val listOfItems = item3.getAll()
        println("Список предметов, которые следует взять с собой: $listOfItems")
    }
}

fun main() {
    val user = User_()
}