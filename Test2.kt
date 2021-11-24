import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    val name = scan.nextLine()
    val example = "вячеслав"
    if (name.lowercase().equals(example)) {
        println("Привет, Вячеслав")
    } else {
        println("Нет такого имени")
    }
}