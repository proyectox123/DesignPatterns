package behavioralpatterns.mediatorpattern.example1

import behavioralpatterns.mediatorpattern.example1.concretecolleague.UserImpl
import behavioralpatterns.mediatorpattern.example1.concretemediator.ChatMediatorImpl


fun main(args: Array<String>) {
    val mediator = ChatMediatorImpl()
    val user1 = UserImpl(mediator, "Java")
    val user2 = UserImpl(mediator, "Kotlin")
    val user3 = UserImpl(mediator, "Javascript")
    val user4 = UserImpl(mediator, "Go")

    mediator.addUser(user1)
    mediator.addUser(user2)
    mediator.addUser(user3)
    mediator.addUser(user4)

    user1.send("Hi All")
}