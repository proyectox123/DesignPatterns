package chainofresponsabilitypattern.client

import chainofresponsabilitypattern.concretehandler.Dollar10Dispenser
import chainofresponsabilitypattern.concretehandler.Dollar20Dispenser
import chainofresponsabilitypattern.concretehandler.Dollar50Dispenser
import chainofresponsabilitypattern.handler.DispenseChain

class ATMDispenseChain {

    internal var chain1: DispenseChain? = null

    init {
        chain1 = Dollar50Dispenser()
        val chain2 = Dollar20Dispenser()
        val chain3 = Dollar10Dispenser()

        chain1?.setNextChain(chain2)
        chain2.setNextChain(chain3)
    }
}