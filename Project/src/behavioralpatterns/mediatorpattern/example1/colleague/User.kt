package behavioralpatterns.mediatorpattern.example1.colleague

import behavioralpatterns.mediatorpattern.example1.mediator.ChatMediator


abstract class User(protected var mediator: ChatMediator, protected var name: String) {

    abstract fun send(msg: String)

    abstract fun receive(msg: String)
}