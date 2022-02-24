package StrategyPattern

class NotFly : FlyBehavior {
    override fun fly() {
        println("not flying...")
    }
}