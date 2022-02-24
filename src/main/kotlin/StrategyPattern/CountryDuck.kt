package StrategyPattern

class CountryDuck(
    val flyBehavior: FlyBehavior,
    val soundBehavior: SoundBehavior
) : Duck {

    override fun display() {
        flyBehavior.fly()
        soundBehavior.quack()
    }

}