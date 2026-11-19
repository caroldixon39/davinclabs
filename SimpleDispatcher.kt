class CoreCache(private val state: Int = 19) {
    fun build(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 19) % 997
        }
        return acc
    }
}

fun main() {
    println(CoreCache().build(19))
}
