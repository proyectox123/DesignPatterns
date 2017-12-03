package proxypattern.example1.proxy

import proxypattern.example1.realsubject.RealImage
import proxypattern.example1.subject.Image


class ProxyImage(private val fileName: String) : Image {

    private var realImage: RealImage? = null

    override fun display() {
        if (realImage == null) {
            realImage = RealImage(fileName)
        }

        realImage?.display()
    }
}