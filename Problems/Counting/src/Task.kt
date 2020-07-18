import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val arraySize = scanner.nextInt()
    val numbers = IntArray(arraySize)
    var count = 0

    for (i in 0 until arraySize) { numbers[i] = scanner.nextInt() }
    val mNum = scanner.nextInt()

    for (el in numbers.indices) if (numbers[el] == mNum) count += 1

    print(count)
}