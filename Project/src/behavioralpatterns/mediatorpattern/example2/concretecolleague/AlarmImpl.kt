package behavioralpatterns.mediatorpattern.example2.concretecolleague

import behavioralpatterns.mediatorpattern.example2.colleague.Alarm

class AlarmImpl : Alarm {
    override fun turnOn() {
        println("${AlarmImpl::class.simpleName} turnOn")
    }

    override fun turnOff() {
        println("${AlarmImpl::class.simpleName} turnOff")
    }

}