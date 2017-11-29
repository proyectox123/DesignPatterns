package decoratorpattern.example1.decorator

import decoratorpattern.example1.component.Coffee

class Milk(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", with milk"

    override fun price() = coffee.price() + 20
}