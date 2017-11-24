package prototypepattern.creator

import prototypepattern.prototype.Animal

class CloneFactory {
    fun getClone(animalSample: Animal): Animal {
        return animalSample.makeCopy()
    }
}