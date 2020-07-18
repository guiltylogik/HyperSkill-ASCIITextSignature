import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val sizeA = scanner.nextInt()
    val nums = IntArray(sizeA)

    for (i in 0 until sizeA) {
        nums[i] = scanner.nextInt()
    }
    var count = 0
    for (i in 0..sizeA - 3) {
        if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) count++
    }
    print(count)
}