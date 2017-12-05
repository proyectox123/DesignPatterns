package structuralpatterns.bridgepattern.example1.concreteimplementor

import structuralpatterns.bridgepattern.example1.implementor.TV

class LG : TV {
    override fun on() {
        println("LG on")
    }

    override fun off() {
        println("LG off")
    }

    override fun tuneChannel(channel: Int) {
        println("LG tuneChannel $channel")
    }

}