package creationalpatterns.factorymethodpattern.example1.concretecreate

import creationalpatterns.factorymethodpattern.example1.product.Dog

class SiberianHusky : Dog {
    override fun speak() {
        println("The husky says \"Dude, what's up?\"")
    }
}