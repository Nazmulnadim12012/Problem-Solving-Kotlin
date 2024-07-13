import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Input a number :")

    val number = reader.nextFloat()

    checkNumber(number)

}

fun checkNumber(number:Float) {
    if ((number%2) == 0f){
        println("Number is even")
    }
    else  println("Number is odd")
}
