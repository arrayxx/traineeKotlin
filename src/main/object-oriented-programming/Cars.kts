package `object-oriented-programming`


class Car {
    var color: String = "Oil-slick"
    var model: String = "Mercedes Maybach"
    var year: String = "2018"
    fun drive() {
        println("Едет машина цвета $color, марки $model, выпущенная в $year году")
    }
}

val myCar = Car()
myCar.drive()
// изменим какие-нибудь параметры, например цвет и год
myCar.let {
    it.color = "Violet"
    it.year = "2021"
}
// еще раз вызовем экземпляр класса
myCar.drive()
