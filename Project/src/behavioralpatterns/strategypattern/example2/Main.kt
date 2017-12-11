package behavioralpatterns.strategypattern.example2

import behavioralpatterns.strategypattern.example2.concretestrategy.StrategyCreditCard
import behavioralpatterns.strategypattern.example2.concretestrategy.StrategyPaypal
import behavioralpatterns.strategypattern.example2.context.Item
import behavioralpatterns.strategypattern.example2.context.ShoppingCart



fun main(args: Array<String>) {
    val cart = ShoppingCart()

    val item1 = Item("1234", 10)
    val item2 = Item("5678", 40)
    val item3 = Item("9012", 35)

    cart.addItem(item1)
    cart.addItem(item2)
    cart.addItem(item3)

    payWithPaypal(cart)//Case 1
    payWithCreditCard(cart)//Case 2
}

private fun payWithPaypal(cart: ShoppingCart){
    cart.pay(StrategyPaypal("mho@test.mx", "del1al6"))
}

private fun payWithCreditCard(cart: ShoppingCart){
    cart.pay(StrategyCreditCard("Test Tester", "1234567890123456", "000", "12/15"))
}