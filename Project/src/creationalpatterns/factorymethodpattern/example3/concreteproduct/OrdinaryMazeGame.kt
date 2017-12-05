package creationalpatterns.factorymethodpattern.example3.concreteproduct

import creationalpatterns.factorymethodpattern.example3.concretecreate.OrdinaryRoom
import creationalpatterns.factorymethodpattern.example3.creator.MazeGame
import creationalpatterns.factorymethodpattern.example3.product.Room

class OrdinaryMazeGame : MazeGame(){
    override fun makeRoom(): Room {
        return OrdinaryRoom()
    }
}