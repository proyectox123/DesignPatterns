package behavioralpatterns.observerpattern.observable

import behavioralpatterns.observerpattern.observer.Observer
import java.util.concurrent.CopyOnWriteArrayList


class RedDress : Observable {

    private val users: MutableList<Observer> = CopyOnWriteArrayList()
    var isInStock = true
    get() {
        return field
    }
    set(isInStock){
        field = isInStock
        notifyObserver()
    }

    override fun addObserver(o: Observer) {
        users.add(o)
    }

    override fun removeObserver(o: Observer) {
        users.remove(o)
    }

    override fun notifyObserver() {
        //Notify all the users
        val listIterator: ListIterator<Observer> = users.listIterator()
        while(listIterator.hasNext()){
            listIterator.next().update()
        }

//        users.forEach {
//            it.update()
//        }

//        for (i in users.indices) {
//            users[i].update()
//            //users.removeAt(i)
//        }
//        for(user: Observer in users){
//            user.update()
//        }
//        val iter = users.iterator()
//        while (iter.hasNext()) {
//            iter.next().update()
//        }

        val itr = users.iterator()
        while (itr.hasNext()) {
            itr.next().update()
        }

//        while (i < users.size) {
//            users[i].update()
//            users.removeAt(i)
//            i++
//        }

//        val iterator = users.iterator()
//        while (iterator.hasNext()) {
//            val user = iterator.next()
//            user.update()
//
//            iterator.remove()
//        }
    }
}