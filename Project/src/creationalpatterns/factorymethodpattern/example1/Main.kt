package creationalpatterns.factorymethodpattern.example1

import creationalpatterns.factorymethodpattern.example1.creator.DogFactory

fun main(args: Array<String>) {
    // create a small dog
    var dog = DogFactory.getDog("small")
    dog.speak()

    // create a big dog
    dog = DogFactory.getDog("big")
    dog.speak()

    // create a working dog
    dog = DogFactory.getDog("working")
    dog.speak()
}