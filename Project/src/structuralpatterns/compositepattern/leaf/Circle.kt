package structuralpatterns.compositepattern.leaf

import structuralpatterns.compositepattern.component.Figure

class Circle : Figure {

    override fun children(): List<Figure>? = null

    override fun add(figure: Figure) {
        throw Exception()
    }

    override fun remove(figure: Figure) {
        throw Exception()
    }

    override fun draw() {
        println("Drawing Circle")
    }
}