package decoratorpattern.example1.decorator

import decoratorpattern.example1.component.Coffee

class Cinnamon(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", with cinnamon"

    override fun price() = coffee.price() + 10
}