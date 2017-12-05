package structuralpatterns.bridgepattern.example1.refinedabstraction

import structuralpatterns.bridgepattern.example1.abstraction.RemoteControl
import structuralpatterns.bridgepattern.example1.implementor.TV


class ConcreteRemote(tv: TV) : RemoteControl(tv) {

    fun setChannelKeyboard(channel: Int) {
        println("ConcreteRemote setChannelKeyboard $channel")
        setChannel(channel)
    }
}