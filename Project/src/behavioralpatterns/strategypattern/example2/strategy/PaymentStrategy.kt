package behavioralpatterns.strategypattern.example2.strategy

interface PaymentStrategy {
    fun pay(amount: Int)
}