package behavioralpatterns.observerpattern.observer

import behavioralpatterns.observerpattern.observable.Observable

class User(private val observable: Observable, private val name: String) : Observer {

    override fun update() {
        buyDress()
        unsubscribe()
    }

    fun buyDress(){
        println("User ${name} got a new red dress!")
    }

    fun unsubscribe(){
        observable.removeObserver(this)
    }
}