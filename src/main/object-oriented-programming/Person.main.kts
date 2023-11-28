class Person {
    // создадим дополнительный объект внутри класса
    companion object {
        // сделаем переменные приватными, т.е. видимыми только внутри класса
        // переменные должны быть доступны при вызове методов класса извне класса
        // т.к. companion object - это публичный объект
        private val name = "Савелий"
        private val age = 24
    }
    fun getName(): String {
        return name
    }
    fun getAge(): Int {
        return age
    }
}

// проверим, что свойства можно вызвать через метод
fun accessToQualities() {
    println(Person().getName())
    println(Person().getAge())
}

accessToQualities()

// проверяем, что вызов параметров name и age недоступен напрямую
// получим ошибку error: cannot access 'name':/'age': it is private in 'Companion'
//Person.name
//Person.age