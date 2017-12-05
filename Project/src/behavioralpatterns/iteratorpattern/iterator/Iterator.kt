package behavioralpatterns.iteratorpattern.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}