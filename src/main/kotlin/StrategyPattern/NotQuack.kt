package StrategyPattern

class NotQuack:SoundBehavior {
    override fun quack() {
        println("not quacking....")
    }
}