open class Animal(val sound: String = "") {
    open fun makeSound() {
        println("The animal makes its unique sound - $sound")
    }
}

class Dog: Animal(sound = "bark") {
    override fun makeSound() {
        println("Dog makes its unique sound - $sound")
    }
}

class Cat: Animal(sound = "meow") {
    override fun makeSound() {
        println("Cat makes its unique sound - $sound")
    }
}

Dog().makeSound()
Cat().makeSound()