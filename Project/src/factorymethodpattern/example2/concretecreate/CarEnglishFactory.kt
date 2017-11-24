package factorymethodpattern.example2.concretecreate

import factorymethodpattern.example2.concreteproduct.CarRightPilot
import factorymethodpattern.example2.creator.CarFactory
import factorymethodpattern.example2.product.Car

class CarEnglishFactory : CarFactory() {
    override fun createCar(): Car {
        return CarRightPilot()
    }
}