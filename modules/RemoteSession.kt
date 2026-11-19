class HybridContext(private val state: Int = 78) {
    fun collect(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 78) % 997
        }
        return total
    }
}

fun main() {
    println(HybridContext().collect(78))
}
