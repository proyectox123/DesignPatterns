package structuralpatterns.decoratorpattern.decorator

import structuralpatterns.decoratorpattern.component.Coffee

class Cinnamon(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", with cinnamon"

    override fun price() = coffee.price() + 10
}