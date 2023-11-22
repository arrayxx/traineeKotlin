enum class DayOfWeek(val value: String, val day: String) {
    DAY1("first", "Monday"),
    DAY2("second", "Tuesday"),
    DAY3("third", "Wednesday"),
    DAY4("fourth", "Thursday"),
    DAY5("fifth", "Friday"),
    DAY6("sixth", "Saturday"),
    DAY7("seventh", "Sunday");
    // создадим метод для вывода дня недели
    fun listOfDays(days: DayOfWeek): String {
        return value + " day is " + day;
    }
}

// создадим функцию для вызова полного списка дней недели
fun getListOfDays() {
    // перменная, содержащая все экземпляры класса DayOfWeek
    val daysOfWeek = DayOfWeek.values()
    // цикл для вывода всех дней недели
    for (day in daysOfWeek) {
        println(day.listOfDays(day))
    }
}

getListOfDays()