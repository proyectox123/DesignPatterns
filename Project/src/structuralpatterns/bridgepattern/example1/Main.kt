package structuralpatterns.bridgepattern.example1

import structuralpatterns.bridgepattern.example1.concreteimplementor.LG
import structuralpatterns.bridgepattern.example1.concreteimplementor.Samsung
import structuralpatterns.bridgepattern.example1.concreteimplementor.Sony
import structuralpatterns.bridgepattern.example1.implementor.TV
import structuralpatterns.bridgepattern.example1.refinedabstraction.ConcreteRemote

fun main(args: Array<String>) {
    val tvSony = Sony()
    val tvSamsung = Samsung()
    val tvLG = LG()

    concreteImplementor(tvSony)
    concreteImplementor(tvSamsung)
    concreteImplementor(tvLG)
}

private fun concreteImplementor(tv: TV){
    val concreteRemote = ConcreteRemote(tv)
    concreteRemote.on()
    concreteRemote.setChannelKeyboard(100)
    concreteRemote.off()
    println()
}