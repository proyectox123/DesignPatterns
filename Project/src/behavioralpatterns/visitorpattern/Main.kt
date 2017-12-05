package behavioralpatterns.visitorpattern

import behavioralpatterns.visitorpattern.concreteelement.Book
import behavioralpatterns.visitorpattern.element.ItemElement
import behavioralpatterns.visitorpattern.concretevisitor.ShoppingCartVisitorImpl
import behavioralpatterns.visitorpattern.concreteelement.Fruit

fun main(args: Array<String>) {
    val items = arrayOf<ItemElement>(Book(20, "1234"),
            Book(100, "5678"),
            Fruit(10, 2, "Banana"),
            Fruit(5, 5, "Apple"))

    val total = calculatePrice(items)
    println("****************************************************************")
    println("Total Cost = $total")
}

private fun calculatePrice(items: Array<ItemElement>): Int {
    val visitor = ShoppingCartVisitorImpl()
    return items.sumBy { it.accept(visitor) }
}