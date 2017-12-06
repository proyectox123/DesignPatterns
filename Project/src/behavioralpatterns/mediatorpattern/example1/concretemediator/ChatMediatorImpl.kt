package behavioralpatterns.mediatorpattern.example1.concretemediator

import behavioralpatterns.mediatorpattern.example1.colleague.User
import behavioralpatterns.mediatorpattern.example1.mediator.ChatMediator

class ChatMediatorImpl : ChatMediator {

    private val users: MutableList<User> = ArrayList()

    override fun sendMessage(message: String, user: User) {
        users.forEach { u -> receiveMessage(message, user, u) }
    }

    override fun addUser(user: User) {
        users.add(user)
    }

    private fun receiveMessage(message: String, user: User, u: User){
        when {
            u != user -> u.receive(message)
        }
    }
}