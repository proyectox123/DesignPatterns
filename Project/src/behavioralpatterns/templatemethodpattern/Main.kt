package behavioralpatterns.templatemethodpattern

import behavioralpatterns.templatemethodpattern.abstractclass.Game
import behavioralpatterns.templatemethodpattern.concreteclass.Basketball
import behavioralpatterns.templatemethodpattern.concreteclass.Football
import behavioralpatterns.templatemethodpattern.concreteclass.Volleyball

fun main(args: Array<String>) {
    playFootballGame()
    playBasketballGame()
    playVolleyballGame()
}

private fun playFootballGame(){
    val game: Game = Football()
    game.play()
}

private fun playBasketballGame(){
    val game: Game = Basketball()
    game.play()
}

private fun playVolleyballGame(){
    val game: Game = Volleyball()
    game.play()
}