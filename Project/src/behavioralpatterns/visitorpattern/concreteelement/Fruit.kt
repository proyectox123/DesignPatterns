package behavioralpatterns.visitorpattern.concreteelement

import behavioralpatterns.visitorpattern.visitor.ShoppingCartVisitor
import behavioralpatterns.visitorpattern.element.ItemElement


class Fruit(pricePerKg: Int, weight: Int, name: String) : ItemElement {

    var pricePerKg: Int = pricePerKg
        private set
    var weight: Int = weight
        private set
    var name: String = name
        private set

    override fun accept(visitor: ShoppingCartVisitor): Int {
        println("Fruit accept")
        return visitor.visit(this)
    }

}