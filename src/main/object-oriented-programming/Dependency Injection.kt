/*
13. Создайте классы Engine и Tires. Затем создайте класс Car,
который получает Engine и Tires через конструктор (Dependency Injection).
 */


// создадим класс двигателя с методом start
class Engine {
    fun start(): String = "A car is getting started..."

    // переопределим функцию toString, чтобы распечатывалось значение объекта, а не его тип
    override fun toString(): String {
        return start()
    }

}

// создадим класс Шины, который принимает на вход тип резины
class Tires(private val type: String) {
    // создадим два свойства класса для зимней и летней резины
    private var winterTires: WinterTires? = null
    private var summerTires: SummerTires? = null
    // добавим инициализатор
    init {
        when (type) {
            // если на вход значения резины подается summer, то отображать текст для летних шин
            "Summer" -> {
                summerTires = SummerTire()
            }
            // если на вход значения резины подается winter, то отображать текст для зимних шин
            "Winter" -> {
                winterTires = WinterTire()
            }
        }
    }

    // переопределим toString еще раз, но уже для вывода winterTires или summerTires
    // костыль в том, что мы все время выводим оба значения, просто одно может быть null
    // не знаю, как сделать лучше :(
    override fun toString(): String {
        val winterTiresInfo = winterTires?.getTires()
        val summerTiresInfo = summerTires?.getTires()
        return "$winterTiresInfo\n$summerTiresInfo"
    }

}

// создадим два интерфейса с типами шин, каждый из которых имеет метод getTires
interface WinterTires {
    fun getTires(): String
}

interface SummerTires {
    fun getTires(): String
}

// создадим два класса с типом шин, наследуемся по соотвутствующему интерфейсу
// переопределим метод getTires для каждого типа резины
class WinterTire: WinterTires {
    override fun getTires() = "Winter tires are installed"
}

class SummerTire: SummerTires {
    override fun getTires() = "Summer tires are installed"
}

/* создадим класс Car с двумя приватными полями engine и tires
поля отражают использование принципа dependency injection
мы используем оба класса Engine/Tires внутри Car, но не используем явное наследование
каждое поле использует тип своего класса Engine, либо Tires
 */
class Car(private val engine: Engine, private val tires: Tires) {
    fun carComponents() {
        println(engine)
        println(tires)
    }
}

// точка входа в программу
fun main() {
    // создадим переменную car, которая вызывает класс Car
    val carInWinterTire = Car(Engine(), Tires("Winter"))
    carInWinterTire.carComponents()
}