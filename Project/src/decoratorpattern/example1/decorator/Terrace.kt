package decoratorpattern.example1.decorator

import decoratorpattern.example1.component.Coffee

class Terrace(private var coffee: Coffee) : Coffee {

    override fun description() = coffee.description() + ", served on the terrace"

    override fun price() = coffee.price() + 5
}