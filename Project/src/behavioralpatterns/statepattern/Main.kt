package behavioralpatterns.statepattern

fun main(args: Array<String>) {
    path1()
    path2()
    path3()
    path4()
    path5()
}

private fun path1(){
    println("/********************************path1********************************/")
    val microwave = Microwave()
    microwave.setMinPower()
    microwave.cooking()
    microwave.turnOff()
}

private fun path2(){
    println("/********************************path2********************************/")
    val microwave = Microwave()
    microwave.setMaxPower()
    microwave.cooking()
    microwave.turnOff()
}

private fun path3(){
    println("/********************************path3********************************/")
    val microwave = Microwave()
    microwave.setMaxPower()
    microwave.setMinPower()
    microwave.cooking()
    microwave.turnOff()
}

private fun path4(){
    println("/********************************path4********************************/")
    val microwave = Microwave()
    microwave.setMinPower()
    microwave.openDoor()
    microwave.turnOff()
    microwave.setMaxPower()
    microwave.cooking()
    microwave.turnOff()
}

private fun path5(){
    println("/********************************path5********************************/")
    val microwave = Microwave()
    microwave.setMinPower()
    microwave.cooking()
    microwave.openDoor()
    microwave.turnOff()
    microwave.openDoor()
}