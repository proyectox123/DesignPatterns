package structuralpatterns.compositepattern.component

interface Figure {
    fun draw()

    fun children() : List<Figure>?
    fun add(figure: Figure)
    fun remove(figure: Figure)
}