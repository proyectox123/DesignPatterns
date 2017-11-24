package prototypepattern.example2.creator

import prototypepattern.example2.prototype.Animal

class CloneFactory {
    fun getClone(animalSample: Animal): Animal {
        return animalSample.makeCopy()
    }
}