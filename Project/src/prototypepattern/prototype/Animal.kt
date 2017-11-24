package prototypepattern.prototype

interface Animal : Cloneable{
    fun makeCopy(): Animal
}