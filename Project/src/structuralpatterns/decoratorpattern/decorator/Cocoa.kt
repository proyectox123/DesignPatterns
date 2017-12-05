package structuralpatterns.decoratorpattern.decorator

import structuralpatterns.decoratorpattern.component.Coffee

class Cocoa(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", with cocoa"

    override fun price() = coffee.price() + 10
}