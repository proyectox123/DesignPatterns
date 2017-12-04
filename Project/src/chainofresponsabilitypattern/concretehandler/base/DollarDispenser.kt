package chainofresponsabilitypattern.concretehandler.base

import chainofresponsabilitypattern.handler.Currency
import chainofresponsabilitypattern.handler.DispenseChain

open class DollarDispenser(valueOfDollar: Int) : DispenseChain {

    var chain: DispenseChain? = null
    var valueOfDollar: Int? = valueOfDollar

    override fun setNextChain(nextChain: DispenseChain) {
        this.chain = nextChain
    }

    override fun dispense(cur: Currency) {
        valueOfDollar?.let { value ->
            if (cur.amount >= value) {
                val num = cur.amount / value
                val remainder = cur.amount % value
                println("Dispensing $num $valueOfDollar$ note")
                when {
                    remainder != 0 -> this.chain?.dispense(Currency(remainder))
                    else -> { }
                }
            } else {
                this.chain?.dispense(cur)
            }
        }
    }
}