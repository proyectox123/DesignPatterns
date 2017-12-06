package behavioralpatterns.mediatorpattern.example1.mediator

import behavioralpatterns.mediatorpattern.example1.colleague.User

interface ChatMediator {
    fun sendMessage(message: String, user: User)
    fun addUser(user: User)
}