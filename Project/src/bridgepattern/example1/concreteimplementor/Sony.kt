package bridgepattern.example1.concreteimplementor

import bridgepattern.example1.implementor.TV

class Sony : TV {
    override fun on() {
        println("Sony on")
    }

    override fun off() {
        println("Sony off")
    }

    override fun tuneChannel(channel: Int) {
        println("Sony tuneChannel $channel")
    }

}