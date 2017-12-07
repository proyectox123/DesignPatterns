package behavioralpatterns.mementopattern

class DietInfoCaretaker {

    private var objMemento: Any? = null

    fun saveState(dietInfo: DietInfo) {
        objMemento = dietInfo.save()
    }

    fun restoreState(dietInfo: DietInfo) {
        objMemento?.let {
            dietInfo.restore(objMemento as Any)
        }
    }
}