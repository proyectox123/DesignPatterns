package structuralpatterns.decoratorpattern.component

class ShortCoffee : Coffee {

    override fun description() = "Short coffee"

    override fun price() = 90.0
}