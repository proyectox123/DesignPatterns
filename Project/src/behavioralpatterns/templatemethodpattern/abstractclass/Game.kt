package behavioralpatterns.templatemethodpattern.abstractclass

abstract class Game {
    internal abstract fun initialize()
    internal abstract fun startPlay()
    internal abstract fun endPlay()

    //template method
    fun play() {
        initialize()
        startPlay()
        endPlay()
    }
}