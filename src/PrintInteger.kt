
/*How to Print an Integer entered by an user in Kotlin using Scanner*/

import java.util.Scanner

fun main() {

    val reader = Scanner (System.`in`)

    println("Input a number :")

    val number = reader.nextInt()
    println("The number is $number")

}