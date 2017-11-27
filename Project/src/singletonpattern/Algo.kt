package singletonpattern

import java.io.Serializable

class Algo private constructor()//It is necessary to make this constructor private
    : Serializable {

    private fun readResolve(): Any? {
        return INSTANCE
    }

    companion object {

        private var INSTANCE: Algo? = null

        val instance: Algo
            @Synchronized get() {
                if (INSTANCE == null) {
                    INSTANCE = Algo()
                }

                return INSTANCE as Algo
            }
    }
}
