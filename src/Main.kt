fun main() {

    start()

    println("გსურთ პროგრამის ხელახლა დაწყება? თუ კი დააჭირეთ Y/y, თუ არა დააჭირეთ N/n")

    val answer = readLine()

    if (answer != null) {
        resetFunction(answer)
    }

}

private fun start() {

    try {
        println("შემოიყვანეთ X-ის მნიშვნელობა: ")
        val x = readLine()?.toDouble()

        println("შემოიყვანეთ Y-ის მნიშვნელობა: ")
        val y = readLine()?.toDouble()

        val result = calculateZ(x, y)
        println("$x და $y ის ჯამი არის : $result \n")
    } catch (e: NumberFormatException) {
        println("შემოყვანილი მნიშვნელობა უნდა იყოს რიცხვითი! სცადეთ თავიდან.")
        start()
    }

}

private fun calculateZ(x: Double?, y: Double?): Double = x!! + y!!

private fun resetFunction(reply: String) {
    when (reply) {

        "Y" -> main()
        "y" -> main()
        "n" -> System.out
        "N" -> System.out
        else -> System.out
    }

}

