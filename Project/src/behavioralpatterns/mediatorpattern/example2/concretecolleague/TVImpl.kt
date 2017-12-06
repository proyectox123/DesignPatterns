package behavioralpatterns.mediatorpattern.example2.concretecolleague

import behavioralpatterns.mediatorpattern.example2.colleague.TV

class TVImpl : TV {
    override fun turnOn() {
        println("${TVImpl::class.simpleName} turnOn")
    }

    override fun turnOff() {
        println("${TVImpl::class.simpleName} turnOff")
    }

    override fun turnDown() {
        println("${TVImpl::class.simpleName} turnDown")
    }

    override fun turnUp() {
        println("${TVImpl::class.simpleName} turnUp")
    }
}