package structuralpatterns.proxypattern.example1.realsubject

import structuralpatterns.proxypattern.example1.subject.Image

class RealImage(private val fileName: String) : Image {

    init {
        loadFromDisk(fileName)
    }

    override fun display() {
        println("RealImage displaying $fileName")
    }

    private fun loadFromDisk(fileName: String) {
        println("RealImage loading $fileName...")
    }
}