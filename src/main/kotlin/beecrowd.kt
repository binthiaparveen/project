import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    val radius = Scanner.nextDouble()
    val area = 3.14159 * Math.pow(radius, 2.0)
    println("A=${String.format("%.4f", area)}")
}