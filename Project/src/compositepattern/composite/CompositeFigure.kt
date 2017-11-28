package compositepattern.composite

import compositepattern.component.Figure

class CompositeFigure : Figure {

    private val figureList: MutableList<Figure> = ArrayList()

    override fun children() = figureList

    override fun remove(figure: Figure) {
        figureList.remove(figure)
    }

    override fun add(figure: Figure){
        figureList.add(figure)
    }

    override fun draw() {
        figureList.forEach { figure -> figure.draw() }
    }
}