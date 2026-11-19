class LocalLoader(private val state: Int = 68) {
    fun decode(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 68) % 997
        }
        return total
    }
}

fun main() {
    println(LocalLoader().decode(68))
}
