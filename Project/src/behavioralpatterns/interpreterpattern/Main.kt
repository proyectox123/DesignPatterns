package behavioralpatterns.interpreterpattern

import behavioralpatterns.interpreterpattern.abstractexpression.ExpressionName
import behavioralpatterns.interpreterpattern.context.Interpreter

fun main(args: Array<String>) {

    val notes : MutableMap<ExpressionName, Double> = HashMap()
    notes.put(ExpressionName.PRACTICA, 7.0)
    notes.put(ExpressionName.CONDUCTA, 6.0)
    notes.put(ExpressionName.EXAMEN, 8.7)

    val interpret = Interpreter().getInterpreter()
    println("interpret ${interpret.interpret(notes)}")
}