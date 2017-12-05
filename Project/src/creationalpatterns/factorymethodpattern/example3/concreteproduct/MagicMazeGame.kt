package creationalpatterns.factorymethodpattern.example3.concreteproduct

import creationalpatterns.factorymethodpattern.example3.concretecreate.MagicRoom
import creationalpatterns.factorymethodpattern.example3.creator.MazeGame
import creationalpatterns.factorymethodpattern.example3.product.Room

class MagicMazeGame : MazeGame(){
    override fun makeRoom(): Room {
        return MagicRoom()
    }
}