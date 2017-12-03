package proxypattern.example1

import proxypattern.example1.proxy.ProxyImage

fun main(args: Array<String>) {
    val image = ProxyImage("image_example.jpg")
    //image will be loaded from disk
    image.display()

    //image will not be loaded from disk
    image.display()
}