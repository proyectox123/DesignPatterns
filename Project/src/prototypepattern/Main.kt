package prototypepattern

import prototypepattern.concreteprototype.Sheep
import prototypepattern.creator.CloneFactory

fun main(args: Array<String>) {
    val animalMaker = CloneFactory()
    val sally = Sheep()
    val dolly = animalMaker.getClone(sally) as Sheep

    println("Sally $sally - HashCode: ${System.identityHashCode(System.identityHashCode(sally))}")
    println("Clone $dolly - HashCode: ${System.identityHashCode(System.identityHashCode(dolly))}")
}