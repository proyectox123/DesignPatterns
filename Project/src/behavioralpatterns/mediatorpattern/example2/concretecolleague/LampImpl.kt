package behavioralpatterns.mediatorpattern.example2.concretecolleague

import behavioralpatterns.mediatorpattern.example2.colleague.Lamp

class LampImpl : Lamp {

    override fun turnOn() {
        println("${LampImpl::class.simpleName} turnOn")
    }

    override fun turnOff() {
        println("${LampImpl::class.simpleName} turnOff")
    }

    override fun turnDown() {
        println("${LampImpl::class.simpleName} turnDown")
    }

    override fun turnUp() {
        println("${LampImpl::class.simpleName} turnUp")
    }
}