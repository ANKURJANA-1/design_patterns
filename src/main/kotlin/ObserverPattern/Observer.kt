package ObserverPattern

interface Observer {
    fun add(obseravel: Obseravel)
    fun remove(obseravel: Obseravel)
    fun notifyDataSetChange()
}