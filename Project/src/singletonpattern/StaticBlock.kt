package singletonpattern

object StaticBlock {

    var instance: StaticBlock? = null
        private set

    //static block initialization for exception handling
    init {
        try {
            instance = StaticBlock
        } catch (e: Exception) {
            throw RuntimeException("Exception occured in creating singleton instance")
        }

    }
}