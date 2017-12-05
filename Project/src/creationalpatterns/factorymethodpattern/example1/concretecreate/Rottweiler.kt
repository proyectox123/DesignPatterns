package creationalpatterns.factorymethodpattern.example1.concretecreate

import creationalpatterns.factorymethodpattern.example1.product.Dog

class Rottweiler : Dog {
    override fun speak() {
        println("The Rottweiler says (in a very deep voice) \"WOOF!\"")
    }
}