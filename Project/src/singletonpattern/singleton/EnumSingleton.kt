package singletonpattern.singleton

enum class EnumSingleton {
    INSTANCE;

    fun printText() = println("EnumSingleton")
}