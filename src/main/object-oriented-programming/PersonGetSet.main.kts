class Person() {
    // создадим объект класса для вызова геттера и сеттера свойств name и age
    object getterAndSetter {
        var name: String = ""
            // геттер будет просто вызван явно, без каких-либо особых условий
            get() = field
            // в сеттере сделаем проверку на длину строки
            set(value) {
            field = value
                if (value.length <= 50) {
                println(field)
                } else {
                    println("Строка слишком длинная! Длина должна быть 50 символов")
                }
            }
        var age: Int = 0
            get() = field
            // в сеттере для возраста сделаем проверку на отрицательное число
            set(value) {
                field = value
                if (value > 0) {
                    println(value)
                } else {
                    println("Ошибка! Возраст не может быть отрицательным")
                }
            }
    }
}

// функция для передачи значений и вызова класса Person
fun getNameAndAge() {
    val person = Person.getterAndSetter
    person.name = readln().orEmpty()
    person.age = readln().toInt()
}

getNameAndAge()