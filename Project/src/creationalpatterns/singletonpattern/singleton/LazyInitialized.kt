package creationalpatterns.singletonpattern.singleton

class LazyInitialized private constructor() {

    companion object {

        private var INSTANCE: LazyInitialized? = null

        fun getInstance(): LazyInitialized {
            if (INSTANCE == null) {
                INSTANCE = LazyInitialized()
            }

            return INSTANCE as LazyInitialized
        }
    }

    fun printText() = println("LazyInitialized")
}