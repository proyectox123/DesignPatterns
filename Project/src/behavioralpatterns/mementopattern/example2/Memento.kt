package behavioralpatterns.mementopattern.example2

import java.util.*

class Memento {

    private val backup: ArrayList<ArrayList<Register>> = ArrayList()

    fun setBackup(bd: List<Register>) {
        val list = ArrayList<Register>()
        list.addAll(bd)
        backup.add(list)
    }

    fun getBackup(version: Int) = when {
        version < 0 || version > size -> null
        else -> backup[version]
    }

    val size: Int
        get() = backup.size
}
