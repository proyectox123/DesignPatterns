package bridgepattern.example1.abstraction

import bridgepattern.example1.implementor.TV


abstract class RemoteControl(tv: TV) {
    private var implementor: TV? = tv

    fun on() {
        implementor?.on()
    }

    fun off() {
        implementor?.off()
    }

    fun setChannel(channel: Int) {
        implementor?.tuneChannel(channel)
    }
}