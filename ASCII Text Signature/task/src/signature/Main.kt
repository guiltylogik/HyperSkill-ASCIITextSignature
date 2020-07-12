package signature

fun main() {
    val name = readLine()!!
    val borders = "*".repeat(name.length + 4)

    println(borders)
    println("* $name *")
    println(borders)
}
