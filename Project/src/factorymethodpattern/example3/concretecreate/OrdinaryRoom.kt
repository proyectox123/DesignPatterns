package factorymethodpattern.example3.concretecreate

import factorymethodpattern.example3.product.Room

class OrdinaryRoom : Room {
    override fun connect(room: Room) {
        println("OrdinaryRoom connect")
    }
}