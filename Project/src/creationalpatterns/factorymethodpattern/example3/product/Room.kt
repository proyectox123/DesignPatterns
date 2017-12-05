package creationalpatterns.factorymethodpattern.example3.product

interface Room {
    fun connect(room: Room)
}