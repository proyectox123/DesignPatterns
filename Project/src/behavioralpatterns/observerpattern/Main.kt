package behavioralpatterns.observerpattern

import behavioralpatterns.observerpattern.observable.RedDress
import behavioralpatterns.observerpattern.observer.User

private val users: MutableList<User> = ArrayList()

fun main(args: Array<String>) {
    val redDress = RedDress()
    createUsers(redDress)
    addObservers(redDress)
    redDress.isInStock = true
}

private fun createUsers(redDress: RedDress){
    (0..5).mapTo(users) { User(redDress, "Test $it") }
}

private fun addObservers(redDress: RedDress){
    users.forEach { user -> redDress.addObserver(user) }
}