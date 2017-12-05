package behavioralpatterns.interpreterpattern.concreteexpressions

import behavioralpatterns.interpreterpattern.abstractexpression.Expression
import behavioralpatterns.interpreterpattern.abstractexpression.ExpressionName

class ExpressionVariable(private var variable: ExpressionName) : Expression{

    override fun interpret(context: Map<ExpressionName, Double>) = context[variable] ?: 0.0
}