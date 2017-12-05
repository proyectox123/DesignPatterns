package behavioralpatterns.visitorpattern.concreteelement

import behavioralpatterns.visitorpattern.element.ItemElement
import behavioralpatterns.visitorpattern.visitor.ShoppingCartVisitor
class Book(price: Int, isbnNumber: String) : ItemElement {

    var price: Int = price
        private set
    var isbnNumber: String = isbnNumber
        private set

    override fun accept(visitor: ShoppingCartVisitor): Int {
        println("Book accept")
        return visitor.visit(this);
    }
}

