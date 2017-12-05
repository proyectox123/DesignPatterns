package creationalpatterns.factorymethodpattern.example2

import creationalpatterns.factorymethodpattern.example2.concretecreate.CarAmericanFactory
import creationalpatterns.factorymethodpattern.example2.concretecreate.CarEnglishFactory
import creationalpatterns.factorymethodpattern.example2.creator.CarFactory
import creationalpatterns.factorymethodpattern.example2.product.Car

fun main(args: Array<String>) {
    var factory: CarFactory = CarEnglishFactory()
    val car: Car = factory.create()
    println("Just for print: ${car.assembleChassis()}")

    factory = CarAmericanFactory()
    factory.create()
}