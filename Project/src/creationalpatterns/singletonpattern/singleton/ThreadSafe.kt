package creationalpatterns.singletonpattern.singleton

class ThreadSafe private constructor() {

    companion object {

        private var INSTANCE: ThreadSafe? = null

        @Synchronized
        fun getInstance(): ThreadSafe {
            if (INSTANCE == null) {
                synchronized(ThreadSafe::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = ThreadSafe()
                    }
                }
            }

            return INSTANCE as ThreadSafe
        }
    }

    fun printText() = println("ThreadSafe")
}