package flyweightpattern.example2.flyweightfactory

import flyweightpattern.example2.concreteflyweight.TreeType
import java.awt.Color
import java.util.HashMap

object TreeFactory {
    private var treeTypes: MutableMap<String, TreeType> = HashMap()

    fun getTreeType(name: String, color: Color, otherTreeData: String): TreeType {
        var result: TreeType? = treeTypes[name]
        if (result == null) {
            result = TreeType(name, color, otherTreeData)
            treeTypes.put(name, result)
            println("TreeFactory -> It has created a new type of tree: ${result.name}")
            println("TreeFactory -> Size of treeTypes: ${treeTypes.size}")
        }

        return result
    }
}