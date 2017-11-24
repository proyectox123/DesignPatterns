package factorymethodpattern.example1.concretecreate

import factorymethodpattern.example1.product.Dog

class Rottweiler : Dog {
    override fun speak() {
        println("The Rottweiler says (in a very deep voice) \"WOOF!\"")
    }
}