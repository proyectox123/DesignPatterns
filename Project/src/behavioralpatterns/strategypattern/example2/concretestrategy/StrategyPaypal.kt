package behavioralpatterns.strategypattern.example2.concretestrategy

import behavioralpatterns.strategypattern.example2.strategy.PaymentStrategy

class StrategyPaypal(private val emailId: String,
                     private val password: String) : PaymentStrategy {

    override fun pay(amount: Int) {
        println(amount.toString() + " paid using Paypal.")
        println(toString())
    }

    override fun toString(): String {
        return "StrategyPaypal(emailId='$emailId', password='$password')"
    }
}