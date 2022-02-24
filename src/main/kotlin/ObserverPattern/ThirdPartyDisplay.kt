package ObserverPattern

class ThirdPartyDisplay : Obseravel, Display {
    private var count: Int = 0
    override fun display() {
        upadte()
    }

    override fun upadte() {
        println("upadted third party display ${count++}")
    }
}