fun main() {
    println("Enter a number to calculate its factorial:")
    val number = readLine()?.toIntOrNull()
    if (number != null) {
        val factorialResult = factorial(number)
        println("Factorial of $number is: $factorialResult")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
