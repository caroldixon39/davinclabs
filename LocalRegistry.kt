class LocalProvider(private val state: Int = 4) {
    fun fetch(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 4) % 997
        }
        return total
    }
}

fun main() {
    println(LocalProvider().fetch(4))
}
