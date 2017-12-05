package creationalpatterns.singletonpattern.singleton

class StaticBlock {

    companion object {
        var INSTANCE: StaticBlock? = null
            private set

        //static block initialization for exception handling
        init {
            try {
                INSTANCE = StaticBlock()
            } catch (e: Exception) {
                throw RuntimeException("Exception occured in creating singleton instance")
            }

        }
    }

    fun printText() = println("StaticBlock")
}