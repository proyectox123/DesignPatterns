package behavioralpatterns.interpreterpattern.abstractexpression

interface Expression {
    fun interpret(context: Map<ExpressionName, Double>) : Double
}