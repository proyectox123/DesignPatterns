package decoratorpattern.example1.decorator

import decoratorpattern.example1.component.Coffee

class Ice(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", is ice"

    override fun price() = coffee.price() + 30
}