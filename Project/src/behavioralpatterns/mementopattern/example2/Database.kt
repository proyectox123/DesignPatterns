package behavioralpatterns.mementopattern.example2

class Database {

    private var list: MutableList<Register>? = null
    private var memento: Memento = Memento()

    init {
        list = ArrayList<Register>()
    }

    fun addRegister(name: String, age: Int, isActive: Boolean){
        val registerTemp = Register(name, age, isActive)
        list?.add(registerTemp)
    }

    fun clearDatabase(){
        list = null
        println("Database clearDatabase!!!")
    }

    fun showList(){
        when {
            list == null || list!!.isEmpty() -> println("Database showlist clean!")
            else -> list?.forEach {
                it.getRegister()
            }
        }
    }

    fun createBackup(){
        list?.let {
            memento.setBackup(it)
        }
    }

    fun getBackup(version: Int){
        list = ArrayList<Register>()
        memento.getBackup(version)?.forEach {
            list?.add(it)
        }
    }

    fun getBackupSize() = memento.size

    inner class Memento {

        private val backup: java.util.ArrayList<java.util.ArrayList<Register>> = java.util.ArrayList()

        fun setBackup(bd: List<Register>) {
            val list = java.util.ArrayList<Register>()
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
}