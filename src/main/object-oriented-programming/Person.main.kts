class Person(private val name: String = "Савелий",
             private val age: Int = 24) {
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