class AsyncEngine(private val state: Int = 95) {
    fun encode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 95) % 997
        }
        return value
    }
}

fun main() {
    println(AsyncEngine().encode(95))
}
