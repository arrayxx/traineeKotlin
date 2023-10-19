fun main(args: Array<String>) {
    fun conditionCheck(userInput: Int): Int {
        if (userInput == 0) {
            println("Ваше число нейтрально")
        } else if (userInput > 0) {
            println("Ваше число положительное")
        } else if (userInput < 0) {
            println("Ваше число отрицательное")
        }
        return userInput
    }
    println("Введите ваше число: ")
    val inputNumber = readln().toInt()
    var userInput = conditionCheck(inputNumber)
}