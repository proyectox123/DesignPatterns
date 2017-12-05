package structuralpatterns.flyweightpattern.example2.concreteflyweight

import structuralpatterns.flyweightpattern.example2.flyweightfactory.TreeFactory
import structuralpatterns.flyweightpattern.example2.flyweightinterface.Tree
import java.awt.Color
import java.awt.Graphics
import java.util.ArrayList
import javax.swing.JFrame

class Forest : JFrame() {
    private val trees = ArrayList<Tree>()

    fun plantTree(x: Int, y: Int, name: String, color: Color, otherTreeData: String) {
        val type = TreeFactory.getTreeType(name, color, otherTreeData)
        val tree = Tree(x, y, type)
        trees.add(tree)
    }

    override fun paint(graphics: Graphics) {
        trees.forEach { tree -> tree.draw(graphics) }
    }
}