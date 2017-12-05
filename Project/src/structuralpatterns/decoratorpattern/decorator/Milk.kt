package structuralpatterns.decoratorpattern.decorator

import structuralpatterns.decoratorpattern.component.Coffee

class Milk(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", with milk"

    override fun price() = coffee.price() + 20
}