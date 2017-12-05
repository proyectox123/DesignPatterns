package creationalpatterns.prototypepattern.example2

import creationalpatterns.prototypepattern.example2.concreteprototype.Sheep
import creationalpatterns.prototypepattern.example2.creator.CloneFactory

fun main(args: Array<String>) {
    val animalMaker = CloneFactory()
    val sally = Sheep()
    val dolly = animalMaker.getClone(sally) as Sheep

    println("Sally $sally - HashCode: ${System.identityHashCode(System.identityHashCode(sally))}")
    println("Clone $dolly - HashCode: ${System.identityHashCode(System.identityHashCode(dolly))}")
}