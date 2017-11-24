package factorymethodpattern.example1.concretecreate

import factorymethodpattern.example1.product.Dog

class Poodle : Dog {
    override fun speak() {
        println("The poodle says \"arf\"")
    }
}