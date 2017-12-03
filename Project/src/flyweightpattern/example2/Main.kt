package flyweightpattern.example2

import flyweightpattern.example2.concreteflyweight.Forest
import java.awt.Color

private var count1: Int = 0
private var count2: Int = 0
private var count3: Int = 0
private var count4: Int = 0
private var count5: Int = 0

var CANVAS_SIZE_X = 1240
var CANVAS_SIZE_Y = 680
var TREES_TO_DRAW = 1000000
var TREE_TYPES = 5

fun main(args: Array<String>) {
    val forest = Forest()
    (0 until TREES_TO_DRAW).forEach { i -> planTree(forest) }

    forest.setSize(CANVAS_SIZE_X, CANVAS_SIZE_Y)
    forest.isVisible = true

    printMessages()
}

private fun printMessages(){
    println("---------------------")
    println("$TREES_TO_DRAW trees drawn")
    println("count1 $count1")
    println("count2 $count2")
    println("count3 $count3")
    println("count4 $count4")
    println("count5 $count5")
    printMemoryUsed()
}

private fun printMemoryUsed(){
    println("---------------------")
    println("Memory usage:")
    println("Tree size (8 bytes) * $TREES_TO_DRAW + TreeTypes size (~30 bytes) * $TREE_TYPES")
    println("---------------------")
    println("Total:")
    println("${convertIntoKiloBytes(TREES_TO_DRAW * 8 + TREE_TYPES * 30)} kB " +
            "(instead of ${convertIntoKiloBytes(TREES_TO_DRAW * 38)} kB)")
    println("${convertIntoMegaBytes(TREES_TO_DRAW * 8 + TREE_TYPES * 30)} MB " +
            "(instead of ${convertIntoMegaBytes(TREES_TO_DRAW * 38)} MB)")
}

private fun planTree(forest: Forest){
    val count = random(1, TREE_TYPES)
    when(count){
        1 -> {
            forest.plantTree(random(0, CANVAS_SIZE_X), random(0, CANVAS_SIZE_Y),
                    "Summer Oak", Color.GREEN, "Oak texture stub")
            count1++
        }
        2 -> {
            forest.plantTree(random(0, CANVAS_SIZE_X), random(0, CANVAS_SIZE_Y),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub")
            count2++
        }
        3 -> {
            forest.plantTree(random(0, CANVAS_SIZE_X), random(0, CANVAS_SIZE_Y),
                    "Other", Color.YELLOW, "Other")
            count3++
        }
        4 -> {
            forest.plantTree(random(0, CANVAS_SIZE_X), random(0, CANVAS_SIZE_Y),
                    "Another", Color.BLUE, "Another")
            count4++
        }
        else -> {
            forest.plantTree(random(0, CANVAS_SIZE_X), random(0, CANVAS_SIZE_Y),
                    "Last one", Color.CYAN, "Last one")
            count5++
        }
    }
}

private fun random(min: Int, max: Int) = min + (Math.random() * (max - min + 1)).toInt()

private fun convertIntoMegaBytes(number: Int) = convertIntoKiloBytes(number) / 1024

private fun convertIntoKiloBytes(number: Int) = number / 1024