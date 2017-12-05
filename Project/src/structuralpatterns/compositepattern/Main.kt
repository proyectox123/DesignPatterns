package structuralpatterns.compositepattern

import structuralpatterns.compositepattern.composite.CompositeFigure
import structuralpatterns.compositepattern.leaf.*

fun main(args: Array<String>) {
    drawByLeaf()
    drawBySelection()
    drawBySuperSelection()
}

private fun drawByLeaf(){
    println("****************************************************************drawByLeaf****************************************************************")
    val circle = Circle()
    circle.draw()
}

private fun drawBySelection(){
    println("****************************************************************drawBySelection****************************************************************")
    val selection = CompositeFigure()
    selection.add(Circle())
    selection.add(Circle())
    selection.add(Circle())
    selection.draw()
}

private fun drawBySuperSelection(){
    println("****************************************************************drawBySuperSelection****************************************************************")
    val selection = CompositeFigure()
    selection.add(Circle())
    selection.add(Square())
    selection.add(Triangle())
    selection.add(Square())
    selection.add(Triangle())
    selection.add(Square())
    selection.add(Triangle())
    selection.add(Square())
    selection.add(Trapeze())
    selection.add(Hexagon())
    selection.add(Hexagon())
    selection.add(Hexagon())
    selection.add(Hexagon())
    selection.add(Hexagon())
    selection.add(Hexagon())

    val superSelection = CompositeFigure()
    superSelection.add(selection)
    superSelection.children()[0].add(Dodecahedron())
    superSelection.draw()
}