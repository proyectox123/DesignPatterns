package behavioralpatterns.observerpattern.observable

import behavioralpatterns.observerpattern.observer.Observer

interface Observable {
    fun addObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObserver()
}