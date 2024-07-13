// Find Frequency of Character

fun main() {
    val str = "Dhaka is capital city of Bangladesh"
    val ch = 'a'
    var frequency = 0


    for (i in 0..str.length-1){

        if (ch == str[i]){
            ++frequency
        }

    }
    println("Frequency of the $ch is $frequency")

}