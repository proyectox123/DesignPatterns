package behavioralpatterns.mediatorpattern.example2

import behavioralpatterns.mediatorpattern.example2.concretecolleague.AlarmImpl
import behavioralpatterns.mediatorpattern.example2.concretecolleague.LampImpl
import behavioralpatterns.mediatorpattern.example2.concretecolleague.RadioImpl
import behavioralpatterns.mediatorpattern.example2.concretecolleague.TVImpl
import behavioralpatterns.mediatorpattern.example2.concretemediator.RoomMediatorImpl

fun main(args: Array<String>) {
    val mediator = RoomMediatorImpl()

    val lamp = LampImpl()
    val tv = TVImpl()
    val radio = RadioImpl()
    val alarm = AlarmImpl()

    mediator.turnOnAlarm(alarm, lamp)
    mediator.turnOffAlarm(alarm, radio)
    mediator.turnOnLamp(lamp, alarm)
    mediator.turnOnRadio(radio, tv)
    mediator.turnOnTV(tv, radio, lamp)
}