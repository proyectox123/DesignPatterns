package creationalpatterns.prototypepattern.example2.prototype

interface Animal : Cloneable{
    fun makeCopy(): Animal
}