package singletonpattern

import java.io.Serializable

class Unique private constructor()//It is necessary to make this constructor private
    : Serializable {

    private fun readResolve(): Any? {//It is importance using deserializable
        return INSTANCE
    }

    companion object {

        private var INSTANCE: Unique? = null

        val instance: Unique
            @Synchronized get() {
                if (INSTANCE == null) {
                    INSTANCE = Unique()
                }

                return INSTANCE as Unique
            }
    }
}