package decoratorpattern.example1

import decoratorpattern.example1.component.Coffee
import decoratorpattern.example1.component.ShortCoffee
import decoratorpattern.example1.decorator.*

fun main(args: Array<String>) {
    firstOrder()
    secondOrder()
    thirdOrder()
    forthOrder()
}

private fun firstOrder(){
    println("****************************************************************firstOrder****************************************************************")
    val shortCoffee = ShortCoffee()
    val coffeeWithMilk = Milk(shortCoffee)
    val coffeeWithMilkAndCocoa = Cocoa(coffeeWithMilk)
    printInfo(coffeeWithMilkAndCocoa)
}

private fun secondOrder(){
    println("****************************************************************secondOrder****************************************************************")
    printInfo(Cocoa(ShortCoffee()))
}

private fun thirdOrder(){
    println("****************************************************************thirdOrder****************************************************************")
    val coffee = Terrace(Ice(Milk(Cinnamon(Cocoa(Cream(ShortCoffee()))))))
    printInfo(coffee)
}

private fun forthOrder(){
    println("****************************************************************forthOrder****************************************************************")
    val coffee = Cream(Cocoa(Cinnamon(Milk(Ice(Terrace(ShortCoffee()))))))
    printInfo(coffee)
}

private fun printInfo(coffee: Coffee){
    println(coffee.description())
    println(coffee.price())
}