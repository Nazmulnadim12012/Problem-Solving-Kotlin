import java.util.*

fun main() {
    val reader = Scanner(System.`in`)

    println("****Input Dividend and Divisor****")

    print("Dividend : ")
    val dividend = reader.nextFloat()

    print("Divisor : ")
    val divisor = reader.nextFloat()

    println("Quotient is : ${quotient(dividend,divisor)}")
    println("Remainder is : ${remainder(dividend,divisor)}")

}

fun quotient(dividend: Float, divisor: Float): Float {

    return dividend / divisor
}

fun remainder(dividend: Float, divisor: Float): Float {

    return dividend % divisor
}