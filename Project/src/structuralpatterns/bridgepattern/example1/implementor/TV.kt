package structuralpatterns.bridgepattern.example1.implementor

interface TV {
    fun on()
    fun off()
    fun tuneChannel(channel: Int)
}