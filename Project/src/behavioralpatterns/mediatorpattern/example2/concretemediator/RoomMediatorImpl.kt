package behavioralpatterns.mediatorpattern.example2.concretemediator

import behavioralpatterns.mediatorpattern.example2.colleague.Alarm
import behavioralpatterns.mediatorpattern.example2.colleague.Lamp
import behavioralpatterns.mediatorpattern.example2.colleague.Radio
import behavioralpatterns.mediatorpattern.example2.colleague.TV
import behavioralpatterns.mediatorpattern.example2.mediator.RoomMediator

class RoomMediatorImpl : RoomMediator {
    override fun turnOnAlarm(alarm: Alarm, lamp: Lamp) {
        println("${RoomMediatorImpl::class.simpleName} turnOnAlarm...")
        alarm.turnOn()
        lamp.turnOn()
    }

    override fun turnOffAlarm(alarm: Alarm, radio: Radio) {
        println("${RoomMediatorImpl::class.simpleName} turnOffAlarm...")
        alarm.turnOff()
        radio.turnOn()
    }

    override fun turnOnLamp(lamp: Lamp, alarm: Alarm) {
        println("${RoomMediatorImpl::class.simpleName} turnOnLamp...")
        lamp.turnOn()
        alarm.turnOff()//TODO Validate if alarm is on
    }

    override fun turnOnRadio(radio: Radio, tv: TV) {
        println("${RoomMediatorImpl::class.simpleName} turnOnRadio...")
        radio.turnOn()
        tv.turnDown()//TODO Validate if TV is on
    }

    override fun turnOnTV(tv: TV, radio: Radio, lamp: Lamp) {
        println("${RoomMediatorImpl::class.simpleName} turnOnTV...")
        tv.turnOn()
        radio.turnOff()
        lamp.turnDown()//TODO Validate if lamp is on
    }
}