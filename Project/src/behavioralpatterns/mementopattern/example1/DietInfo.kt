package behavioralpatterns.mementopattern.example1

class DietInfo(internal var personName: String, internal var dayNumber: Int, internal var weight: Int) {

    override fun toString(): String {
        return "Name: $personName, day number: $dayNumber, weight: $weight"
    }

    fun setDayNumberAndWeight(dayNumber: Int, weight: Int) {
        this.dayNumber = dayNumber
        this.weight = weight
    }

    fun save(): Memento {
        return Memento(personName, dayNumber, weight)
    }

    fun restore(objMemento: Any) {
        val memento = objMemento as Memento
        personName = memento.mementoPersonName
        dayNumber = memento.mementoDayNumber
        weight = memento.mementoWeight
    }

    inner class Memento(internal var mementoPersonName: String, internal var mementoDayNumber: Int, internal var mementoWeight: Int)
}