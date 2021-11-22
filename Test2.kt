fun main() {
    val scan = java.util.Scanner(System.`in`)
    var name = scan.nextLine()
    val example = "вячеслав"
    if (name.lowercase().equals(example)) {
        println("Привет, Вячеслав")
    } else {
        println("Нет такого имени")
    }
}