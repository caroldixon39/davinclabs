class StreamClient(private val state: Int = 72) {
    fun build(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 72) % 997
        }
        return total
    }
}

fun main() {
    println(StreamClient().build(72))
}
