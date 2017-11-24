package factorymethodpattern.example3.creator

import factorymethodpattern.example3.product.Room

abstract class MazeGame {

    private val rooms: MutableList<Room> = ArrayList()

    protected abstract fun makeRoom(): Room

    fun create(){
        val room1: Room = makeRoom()
        val room2: Room = makeRoom()
        room1.connect(room2)
        rooms.add(room1)
        rooms.add(room2)
    }
}