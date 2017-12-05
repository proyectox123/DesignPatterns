package behavioralpatterns.iteratorpattern.aggregate

import behavioralpatterns.iteratorpattern.iterator.Iterator

interface Aggregate {
    fun getIterator() : Iterator
}