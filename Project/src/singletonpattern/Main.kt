package singletonpattern

import singletonpattern.singleton.*

fun main(args: Array<String>) {

    EagerInitialized.INSTANCE.printText()
    StaticBlock.INSTANCE?.printText()
    LazyInitialized.getInstance().printText()
    ThreadSafe.getInstance().printText()
    BillPugh.instance.printText()
    EnumSingleton.INSTANCE.printText()
}