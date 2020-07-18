import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val arraySize = scanner.nextInt()
    val numbers = IntArray(arraySize) { scanner.nextInt() }
    val (n, m) = IntArray(2) { scanner.nextInt() }
    var count = 0

    for (i in 0 until arraySize - 1) {
        if (numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n) count++
    }

    if (count > 0) {
        println("YES")
    } else {
        println("NO")
    }
}
