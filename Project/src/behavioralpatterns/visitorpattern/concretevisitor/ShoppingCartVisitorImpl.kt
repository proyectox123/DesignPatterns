package behavioralpatterns.visitorpattern.concretevisitor

import behavioralpatterns.visitorpattern.concreteelement.Book
import behavioralpatterns.visitorpattern.concreteelement.Fruit
import behavioralpatterns.visitorpattern.visitor.ShoppingCartVisitor


class ShoppingCartVisitorImpl : ShoppingCartVisitor {

    override fun visit(book: Book): Int {
        val cost = when {
            book.price > 50 -> book.price - 5
            else -> book.price
        }

        println("ShoppingCartVisitorImpl Book ISBN::${book.isbnNumber} cost = $cost")
        return cost
    }

    override fun visit(fruit: Fruit): Int {
        val cost = fruit.pricePerKg * fruit.weight
        println("ShoppingCartVisitorImpl ${fruit.name} cost = $cost")
        return cost
    }
}