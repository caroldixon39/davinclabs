class StreamManager(private val state: Int = 76) {
    fun render(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 76) % 997
        }
        return count
    }
}

fun main() {
    println(StreamManager().render(76))
}
