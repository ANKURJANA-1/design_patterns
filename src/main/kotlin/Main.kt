import ObserverPattern.ForecastDisplay
import ObserverPattern.ObseraverImpl
import ObserverPattern.StatisticsDisplay
import ObserverPattern.ThirdPartyDisplay
import StrategyPattern.*

fun main(args: Array<String>) {
    /*
    val duck: Duck = CityDuck(
        flyBehavior = Fly(),
        soundBehavior = Quack()
    )
    duck.display()
    */
    val statisticsDisplay: StatisticsDisplay = StatisticsDisplay()
    val forecastDisplay: ForecastDisplay = ForecastDisplay()
    val thirdPartyDisplay: ThirdPartyDisplay = ThirdPartyDisplay()

    val obseraverImpl: ObseraverImpl = ObseraverImpl().apply {
        add(statisticsDisplay)
        add(forecastDisplay)
        add(thirdPartyDisplay)
    }
    obseraverImpl.remove(forecastDisplay)
    obseraverImpl.notifyDataSetChange()
    obseraverImpl.add(forecastDisplay)
    obseraverImpl.notifyDataSetChange()
    obseraverImpl.add(forecastDisplay)
    obseraverImpl.notifyDataSetChange()


}