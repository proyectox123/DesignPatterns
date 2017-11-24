package factorymethodpattern.example3.concretecreate

import factorymethodpattern.example3.product.Room

class MagicRoom : Room {
    override fun connect(room: Room) {
        println("MagicRoom connect")
    }
}