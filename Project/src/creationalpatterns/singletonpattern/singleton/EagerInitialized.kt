package creationalpatterns.singletonpattern.singleton

class EagerInitialized private constructor(){

    companion object {
        val INSTANCE = EagerInitialized()
    }

    fun printText() = println("EagerInitialized")
}