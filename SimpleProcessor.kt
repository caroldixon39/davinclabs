class LocalContext(private val state: Int = 59) {
    fun parse(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 59) % 997
        }
        return total
    }
}

fun main() {
    println(LocalContext().parse(59))
}
