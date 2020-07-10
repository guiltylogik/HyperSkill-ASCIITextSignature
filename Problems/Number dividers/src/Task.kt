import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val num = scanner.nextInt()

    val divider = arrayOf(2, 3, 5, 6)

    for (n in divider)
        if (num % n == 0) println("Divided by $n")
}