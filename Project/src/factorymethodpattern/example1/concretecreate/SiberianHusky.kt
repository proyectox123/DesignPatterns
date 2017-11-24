package factorymethodpattern.example1.concretecreate

import factorymethodpattern.example1.product.Dog

class SiberianHusky : Dog {
    override fun speak() {
        println("The husky says \"Dude, what's up?\"")
    }
}