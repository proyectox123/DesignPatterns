package behavioralpatterns.templatemethodpattern.concreteclass

import behavioralpatterns.templatemethodpattern.abstractclass.Game

class Basketball : Game() {

    override fun endPlay() {
        println("Basketball Game Finished!")
    }

    override fun initialize() {
        println("Basketball Game Initialized! Start playing.")
    }

    override fun startPlay() {
        println("Basketball Game Started. Enjoy the game!")
    }
}