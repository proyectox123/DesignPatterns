package behavioralpatterns.strategypattern.example2.concretestrategy

import behavioralpatterns.strategypattern.example2.strategy.PaymentStrategy

class StrategyCreditCard(private val name: String,
                         private val cardNumber: String,
                         private val cvv: String,
                         private val dateOfExpiry: String) : PaymentStrategy {

    override fun pay(amount: Int) {
        println(amount.toString() + " paid with credit/debit card")
        println(toString())
    }

    override fun toString(): String {
        return "StrategyCreditCard(name='$name', cardNumber='$cardNumber', cvv='$cvv', dateOfExpiry='$dateOfExpiry')"
    }
}