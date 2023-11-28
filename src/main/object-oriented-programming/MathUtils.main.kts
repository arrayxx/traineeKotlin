class MathUtils {
    fun add(a: Int, b: Int) =  println("Overload fun add takes 2 arguments: $a, $b")
    fun add(a: Int, b: Int, c: Int) = println("Overload fun add takes 3 arguments: $a, $b, $c")
}

MathUtils().add(23, 17)
MathUtils().add(17, 0, -5)