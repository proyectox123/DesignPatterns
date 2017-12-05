package behavioralpatterns.chainofresponsabilitypattern.handler

interface DispenseChain {
    fun setNextChain(nextChain: DispenseChain)
    fun dispense(cur: Currency)
}