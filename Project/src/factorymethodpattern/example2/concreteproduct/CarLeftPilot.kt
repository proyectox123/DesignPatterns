package factorymethodpattern.example2.concreteproduct

import factorymethodpattern.example2.product.Car

class CarLeftPilot : Car {
    override fun assembleControllers() {
        println("CarLeftPilot assembleControllers")
    }

    override fun assembleChassis() {
        println("CarLeftPilot assembleChassis")
    }

    override fun assembleWheels() {
        println("CarLeftPilot assembleWheels")
    }

}