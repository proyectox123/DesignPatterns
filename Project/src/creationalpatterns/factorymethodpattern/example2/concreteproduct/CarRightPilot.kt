package creationalpatterns.factorymethodpattern.example2.concreteproduct

import creationalpatterns.factorymethodpattern.example2.product.Car

class CarRightPilot : Car {
    override fun assembleControllers() {
        println("CarRightPilot assembleControllers")
    }

    override fun assembleChassis() {
        println("CarRightPilot assembleChassis")
    }

    override fun assembleWheels() {
        println("CarRightPilot assembleWheels")
    }

}