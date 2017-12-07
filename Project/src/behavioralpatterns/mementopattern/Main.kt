package behavioralpatterns.mementopattern

fun main(args: Array<String>) {
    // caretaker
    val dietInfoCaretaker = DietInfoCaretaker()

    // originator
    val dietInfo = DietInfo("Fred", 1, 100)
    println(dietInfo)

    dietInfo.setDayNumberAndWeight(2, 99)
    println(dietInfo)

    println("Saving state.")
    dietInfoCaretaker.saveState(dietInfo)

    dietInfo.setDayNumberAndWeight(3, 98)
    println(dietInfo)

    dietInfo.setDayNumberAndWeight(4, 97)
    println(dietInfo)

    println("Restoring saved state.")
    dietInfoCaretaker.restoreState(dietInfo)
    println(dietInfo)
}