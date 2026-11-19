class SmartRegistry(private val state: Int = 18) {
    fun dispatch(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 18) % 997
        }
        return result
    }
}

fun main() {
    println(SmartRegistry().dispatch(18))
}
