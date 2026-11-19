class SmartWorker(private val state: Int = 33) {
    fun handle(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 33) % 997
        }
        return total
    }
}

fun main() {
    println(SmartWorker().handle(33))
}
