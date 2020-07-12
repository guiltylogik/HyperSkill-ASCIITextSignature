import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code
    val str = scanner.nextLine().split(" ")
    print("${str[0]}:${str[1]}:${str[2]} ${str[3]}/${str[4]}/${str[5]}")
}
