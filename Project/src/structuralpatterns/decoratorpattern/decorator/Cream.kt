package structuralpatterns.decoratorpattern.decorator

import structuralpatterns.decoratorpattern.component.Coffee

class Cream(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", with cream"

    override fun price() = coffee.price() + 10
}