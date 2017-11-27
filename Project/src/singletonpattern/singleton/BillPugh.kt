package singletonpattern.singleton

class BillPugh private constructor() {

    private object SingletonHelper {
        internal val INSTANCE = BillPugh()
    }

    companion object {

        val instance: BillPugh
            get() = SingletonHelper.INSTANCE
    }

    fun printText() = println("BillPugh")
}