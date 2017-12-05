package creationalpatterns.factorymethodpattern.example2.concretecreate

import creationalpatterns.factorymethodpattern.example2.concreteproduct.CarLeftPilot
import creationalpatterns.factorymethodpattern.example2.creator.CarFactory
import creationalpatterns.factorymethodpattern.example2.product.Car

class CarAmericanFactory : CarFactory() {
    override fun createCar(): Car {
        return CarLeftPilot()
    }
}