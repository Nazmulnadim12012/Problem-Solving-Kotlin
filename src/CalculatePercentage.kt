import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    print("Write whole number : ")
    val whole = read.nextFloat()

    print("Write part number : ")
    val part = read.nextFloat()

    println("Percentage is ${calculatePercentage(whole,part)}")


}

fun calculatePercentage (whole:Float,part:Float):Float{
    val result = (part/whole)*100
    return result
}


