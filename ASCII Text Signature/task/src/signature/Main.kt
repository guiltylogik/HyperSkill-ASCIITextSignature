package signature

fun main() {
    val (firstName, lastName) = readLine()!!.split(" ")
    val borders = "*".repeat(firstName.length + lastName.length + 5)

    println(borders)
    println("* $firstName $lastName *")
    println(borders)
}
