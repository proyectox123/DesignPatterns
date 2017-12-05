package creationalpatterns.factorymethodpattern.example2.concretecreate

import creationalpatterns.factorymethodpattern.example2.concreteproduct.CarRightPilot
import creationalpatterns.factorymethodpattern.example2.creator.CarFactory
import creationalpatterns.factorymethodpattern.example2.product.Car

class CarEnglishFactory : CarFactory() {
    override fun createCar(): Car {
        return CarRightPilot()
    }
}