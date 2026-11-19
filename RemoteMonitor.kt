class LocalWorker(private val state: Int = 82) {
    fun sync(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 82) % 997
        }
        return result
    }
}

fun main() {
    println(LocalWorker().sync(82))
}
