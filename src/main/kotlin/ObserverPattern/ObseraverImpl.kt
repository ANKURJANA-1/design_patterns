package ObserverPattern

class ObseraverImpl: Observer {

    private val obseravels: ArrayList<Obseravel> = ArrayList()
    override fun add(obseravel: Obseravel) {
        obseravels.add(obseravel)
    }

    override fun remove(obseravel: Obseravel) {
        obseravels.remove(obseravel)
    }

    override fun notifyDataSetChange() {
        obseravels.forEach { obseravels ->
            obseravels.upadte()
        }
    }
}