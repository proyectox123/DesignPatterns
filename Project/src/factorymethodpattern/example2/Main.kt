package factorymethodpattern.example2

import factorymethodpattern.example2.concretecreate.CarAmericanFactory
import factorymethodpattern.example2.concretecreate.CarEnglishFactory
import factorymethodpattern.example2.creator.CarFactory
import factorymethodpattern.example2.product.Car

fun main(args: Array<String>) {
    var factory: CarFactory = CarEnglishFactory()
    val car: Car = factory.create()
    println("Just for print: ${car.assembleChassis()}")

    factory = CarAmericanFactory()
    factory.create()
}