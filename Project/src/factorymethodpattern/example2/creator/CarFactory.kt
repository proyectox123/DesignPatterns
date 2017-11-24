package factorymethodpattern.example2.creator

import factorymethodpattern.example2.product.Car

abstract class CarFactory {

    fun create() : Car {
        val car = createCar()
        car.assembleChassis()
        car.assembleControllers()
        car.assembleWheels()

        return car
    }

    protected abstract fun createCar(): Car
}