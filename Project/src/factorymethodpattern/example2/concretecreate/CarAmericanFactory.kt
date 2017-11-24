package factorymethodpattern.example2.concretecreate

import factorymethodpattern.example2.concreteproduct.CarLeftPilot
import factorymethodpattern.example2.creator.CarFactory
import factorymethodpattern.example2.product.Car

class CarAmericanFactory : CarFactory() {
    override fun createCar(): Car {
        return CarLeftPilot()
    }
}