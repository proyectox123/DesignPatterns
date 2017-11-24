package factorymethodpattern.example3.concreteproduct

import factorymethodpattern.example3.concretecreate.OrdinaryRoom
import factorymethodpattern.example3.creator.MazeGame
import factorymethodpattern.example3.product.Room

class OrdinaryMazeGame : MazeGame(){
    override fun makeRoom(): Room {
        return OrdinaryRoom()
    }
}