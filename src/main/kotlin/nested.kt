import java.util.Scanner
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)

    print("Enter the year: ")
    var year:Int = reader.nextInt()

    if (year%2==0){
        if (year%400==0 || year%100!=0 && year%4==0){
            println("$year is a leap year & Even")
        } else{
            println("$year isn't a leap year & Even")
        }
    } else{
        if (year%400==0 || year%100!=0 && year%4==0){
            println("$year is a leap year & odd")
        } else{
            println("$year isn't a leap year & odd")
        }
    }

}