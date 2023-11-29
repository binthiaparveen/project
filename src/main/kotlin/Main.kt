import java.util.Scanner
//fun main(args: Array<String>) {
//        var product1Code = readLine()!!.toInt()
//        var product1Units = readLine()!!.toInt()
//        var product1Price = readLine()!!.toDouble()
//
//        var product2Code = readLine()!!.toInt()
//        var product2Units = readLine()!!.toInt()
//        var product2Price = readLine()!!.toDouble()
//
//        val totalAmount = (product1Units * product1Price) + (product2Units * product2Price)
//
//        println("VALOR A PAGAR: R$ %.2f".format(totalAmount))
//    }
fun main() {

        print("Enter the radius of the sphere: ")
        val radius = readLine()!!.toDouble()

        val pi = 3.14159
        val volume = (4.0 / 3) * pi * Math.pow(radius, 3.0)

        println("VOLUME = %.3f".format(volume))
}