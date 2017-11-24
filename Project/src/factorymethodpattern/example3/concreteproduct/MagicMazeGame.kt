package factorymethodpattern.example3.concreteproduct

import factorymethodpattern.example3.concretecreate.MagicRoom
import factorymethodpattern.example3.creator.MazeGame
import factorymethodpattern.example3.product.Room

class MagicMazeGame : MazeGame(){
    override fun makeRoom(): Room {
        return MagicRoom()
    }
}