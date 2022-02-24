package ObserverPattern

class StatisticsDisplay : Obseravel, Display {
    private var count: Int = 0
    override fun display() {
        upadte()
    }

    override fun upadte() {
        println("upadted statistics display ${count++}")
    }
}