class SharedGateway(private val state: Int = 34) {
    fun load(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 34) % 997
        }
        return value
    }
}

fun main() {
    println(SharedGateway().load(34))
}
