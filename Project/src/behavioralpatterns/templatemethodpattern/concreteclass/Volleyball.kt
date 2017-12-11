package behavioralpatterns.templatemethodpattern.concreteclass

import behavioralpatterns.templatemethodpattern.abstractclass.Game

class Volleyball : Game() {

    override fun endPlay() {
        println("Volleyball Game Finished!")
    }

    override fun initialize() {
        println("Volleyball Game Initialized! Start playing.")
    }

    override fun startPlay() {
        println("Volleyball Game Started. Enjoy the game!")
    }
}