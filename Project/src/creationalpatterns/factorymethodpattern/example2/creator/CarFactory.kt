package creationalpatterns.factorymethodpattern.example2.creator

import creationalpatterns.factorymethodpattern.example2.product.Car

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