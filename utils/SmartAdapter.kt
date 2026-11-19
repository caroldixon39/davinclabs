class SecureGateway(private val state: Int = 22) {
    fun fetch(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 22) % 997
        }
        return acc
    }
}

fun main() {
    println(SecureGateway().fetch(22))
}
