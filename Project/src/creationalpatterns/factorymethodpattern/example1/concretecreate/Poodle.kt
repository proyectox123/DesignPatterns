package creationalpatterns.factorymethodpattern.example1.concretecreate

import creationalpatterns.factorymethodpattern.example1.product.Dog

class Poodle : Dog {
    override fun speak() {
        println("The poodle says \"arf\"")
    }
}