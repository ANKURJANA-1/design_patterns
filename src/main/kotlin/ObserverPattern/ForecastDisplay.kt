package ObserverPattern

class ForecastDisplay : Obseravel, Display {
    private var count: Int = 0
    override fun display() {
        upadte()
    }

    override fun upadte() {
        println("upadted forecast display ${count++}")
    }
}