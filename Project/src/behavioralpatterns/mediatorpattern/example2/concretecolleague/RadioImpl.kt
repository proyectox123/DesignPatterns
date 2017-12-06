package behavioralpatterns.mediatorpattern.example2.concretecolleague

import behavioralpatterns.mediatorpattern.example2.colleague.Radio

class RadioImpl : Radio {
    override fun turnOn() {
        println("${RadioImpl::class.simpleName} turnOn")
    }

    override fun turnOff() {
        println("${RadioImpl::class.simpleName} turnOff")
    }

}