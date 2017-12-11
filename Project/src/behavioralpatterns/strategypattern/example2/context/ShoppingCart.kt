package behavioralpatterns.strategypattern.example2.context

import behavioralpatterns.strategypattern.example2.strategy.PaymentStrategy
import java.util.*


class ShoppingCart {

    internal var items: MutableList<Item> = ArrayList()

    fun addItem(item: Item) {
        this.items.add(item)
    }

    fun removeItem(item: Item) {
        this.items.remove(item)
    }

    fun calculateTotal(): Int {
        var sum = 0
        items.forEach { (_, price) -> sum += price }
        return sum
    }

    fun pay(paymentMethod: PaymentStrategy) {
        val amount = calculateTotal()
        paymentMethod.pay(amount)
    }
}