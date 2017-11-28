package compositepattern.leaf

import compositepattern.component.Figure

class Square : Figure {

    override fun children(): List<Figure>? = null

    override fun add(figure: Figure) {
        throw Exception()
    }

    override fun remove(figure: Figure) {
        throw Exception()
    }

    override fun draw() {
        println("Drawing Square")
    }
}