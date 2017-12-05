package behavioralpatterns.visitorpattern.element

import behavioralpatterns.visitorpattern.visitor.ShoppingCartVisitor

interface ItemElement {
    fun accept(visitor: ShoppingCartVisitor) : Int
}