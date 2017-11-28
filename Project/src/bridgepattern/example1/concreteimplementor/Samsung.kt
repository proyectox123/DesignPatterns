package bridgepattern.example1.concreteimplementor

import bridgepattern.example1.implementor.TV

class Samsung : TV {
    override fun on() {
        println("Samsung on")
    }

    override fun off() {
        println("Samsung off")
    }

    override fun tuneChannel(channel: Int) {
        println("Samsung tuneChannel $channel")
    }

}