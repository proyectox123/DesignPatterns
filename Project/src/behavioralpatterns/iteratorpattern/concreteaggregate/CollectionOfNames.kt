package behavioralpatterns.iteratorpattern.concreteaggregate

import behavioralpatterns.iteratorpattern.aggregate.Aggregate
import behavioralpatterns.iteratorpattern.iterator.Iterator

class CollectionOfNames : Aggregate {

    var name = arrayOf("Java", "Kotlin", "Javascript", "Go")

    override fun getIterator(): Iterator {
        return CollectionOfNamesIterate ()
    }

    private inner class CollectionOfNamesIterate : Iterator {
        internal var position: Int = 0

        override operator fun hasNext(): Boolean {
            return position < name.size
        }

        override operator fun next(): Any {
            return when {
                this.hasNext() -> name[position++]
                else -> Any()
            }
        }
    }
}