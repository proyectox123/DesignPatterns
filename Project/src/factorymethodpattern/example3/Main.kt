package factorymethodpattern.example3

import factorymethodpattern.example3.concreteproduct.MagicMazeGame
import factorymethodpattern.example3.concreteproduct.OrdinaryMazeGame

fun main(args: Array<String>) {
    val magicGame = MagicMazeGame()
    magicGame.create()

    val ordinaryGame = OrdinaryMazeGame()
    ordinaryGame.create()
}