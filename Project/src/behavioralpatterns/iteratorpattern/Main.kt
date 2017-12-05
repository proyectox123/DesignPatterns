package behavioralpatterns.iteratorpattern

import behavioralpatterns.iteratorpattern.concreteaggregate.CollectionOfNames

fun main(args: Array<String>) {

    val concreteAggregate = CollectionOfNames()
    val iterator = concreteAggregate.getIterator()

    while (iterator.hasNext()) {
        println("Name: ${iterator.next() as String}")
    }
}