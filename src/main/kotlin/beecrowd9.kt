//fun main() {
//    val sellerName = readLine()!!
//    val fixedSalary = readLine()!!.toDouble()
//    val totalSales = readLine()!!.toDouble()
//
//    val commission = 0.15 * totalSales
//    val totalSalary = fixedSalary + commission
//
//    println("TOTAL = R$ %.2f".format(totalSalary))
//}
//fun main() {
//
//    val radius = readLine()!!.toDouble()
//    val volume = (4.0 / 3) * 3.14159 * (radius * radius * radius)
//    println("VOLUME = %.3f".format(volume))
//}
fun main(args: Array<String>) {

    val distance = readLine()!!.toInt()
    val fuelSpent = readLine()!!.toDouble()

    val averageConsumption = distance / fuelSpent
    println("%.3f km/1".format(averageConsumption))
}

//fun main() {
//    val a = 10
//    val b = 20
//
//    val result = sumTwo (a,b)
//    println(result)
//
//}
//fun sumTwo (a:Int, b:Int) :Int{
//    val x = a + b
//    return x
//}
