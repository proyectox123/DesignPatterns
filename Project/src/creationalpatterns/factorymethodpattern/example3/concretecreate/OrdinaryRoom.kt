package creationalpatterns.factorymethodpattern.example3.concretecreate

import creationalpatterns.factorymethodpattern.example3.product.Room

class OrdinaryRoom : Room {
    override fun connect(room: Room) {
        println("OrdinaryRoom connect")
    }
}