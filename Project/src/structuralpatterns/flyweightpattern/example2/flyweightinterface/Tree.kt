package structuralpatterns.flyweightpattern.example2.flyweightinterface

import structuralpatterns.flyweightpattern.example2.concreteflyweight.TreeType
import java.awt.Graphics

class Tree(private val x: Int, private val y: Int, private val type: TreeType) {
    fun draw(g: Graphics) {
        type.draw(g, x, y)
    }
}