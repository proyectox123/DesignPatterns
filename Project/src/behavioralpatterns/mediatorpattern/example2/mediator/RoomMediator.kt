package behavioralpatterns.mediatorpattern.example2.mediator

import behavioralpatterns.mediatorpattern.example2.colleague.Alarm
import behavioralpatterns.mediatorpattern.example2.colleague.Lamp
import behavioralpatterns.mediatorpattern.example2.colleague.Radio
import behavioralpatterns.mediatorpattern.example2.colleague.TV

interface RoomMediator {
    fun turnOnAlarm(alarm: Alarm, lamp: Lamp)
    fun turnOffAlarm(alarm: Alarm, radio: Radio)
    fun turnOnLamp(lamp: Lamp, alarm: Alarm)
    fun turnOnRadio(radio: Radio, tv: TV)
    fun turnOnTV(tv: TV, radio: Radio, lamp: Lamp)
}