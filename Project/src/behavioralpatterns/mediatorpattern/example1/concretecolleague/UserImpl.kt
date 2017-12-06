package behavioralpatterns.mediatorpattern.example1.concretecolleague

import behavioralpatterns.mediatorpattern.example1.colleague.User
import behavioralpatterns.mediatorpattern.example1.mediator.ChatMediator

class UserImpl(val chatMediator: ChatMediator, val nameUser: String) : User(chatMediator, nameUser) {
    override fun send(msg: String) {
        println("$nameUser: Sending message: $msg")
        mediator.sendMessage(msg, this)
    }

    override fun receive(msg: String) {
        println("$nameUser: Received message: $msg")
    }
}