//package signature
//
//fun main() {
//    val name = readLine()!!
//    val borders = "*".repeat(name.length + 4)
//
//    println(borders)
//    println("* $name *")
//    println(borders)
//}

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    Array(2) {scanner.nextLine()}.also {print("Symbol # ${ it[1] } of the string \"${ it[0] }\" is '${ it[0][it[1].toInt() - 1] }'")}
}
