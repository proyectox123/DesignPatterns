package behavioralpatterns.visitorpattern.visitor

import behavioralpatterns.visitorpattern.concreteelement.Book
import behavioralpatterns.visitorpattern.concreteelement.Fruit

interface ShoppingCartVisitor {
    fun visit(book: Book): Int
    fun visit(fruit: Fruit): Int
}