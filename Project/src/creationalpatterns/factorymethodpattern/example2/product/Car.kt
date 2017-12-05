package creationalpatterns.factorymethodpattern.example2.product

interface Car {
    fun assembleControllers()
    fun assembleChassis()
    fun assembleWheels()
}