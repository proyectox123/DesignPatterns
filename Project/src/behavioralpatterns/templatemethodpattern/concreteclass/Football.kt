package behavioralpatterns.templatemethodpattern.concreteclass

import behavioralpatterns.templatemethodpattern.abstractclass.Game

class Football : Game() {

    override fun endPlay() {
        println("Football Game Finished!")
    }

    override fun initialize() {
        println("Football Game Initialized! Start playing.")
    }

    override fun startPlay() {
        println("Football Game Started. Enjoy the game!")
    }
}