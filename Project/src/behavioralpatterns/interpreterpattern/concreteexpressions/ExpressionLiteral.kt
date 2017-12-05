package behavioralpatterns.interpreterpattern.concreteexpressions

import behavioralpatterns.interpreterpattern.abstractexpression.Expression
import behavioralpatterns.interpreterpattern.abstractexpression.ExpressionName

class ExpressionLiteral(private var literal: Double) : Expression {

    override fun interpret(context: Map<ExpressionName, Double>) = literal
}