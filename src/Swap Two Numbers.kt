import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Input two numbers : ")

    print("First number : ")
    var firstNumber = reader.nextInt()

    print("Second number : ")
    var secondNumber = reader.nextInt()

    println("**** Before swap ****")
    println("First number $firstNumber")
    println("Second number $secondNumber")

    val temporary = firstNumber
    firstNumber = secondNumber
    secondNumber = temporary
    println()


    println("**** After swap ****")
    println("First number $firstNumber")
    println("Second number $secondNumber")





}