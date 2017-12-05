package behavioralpatterns.interpreterpattern.concreteexpressions

import behavioralpatterns.interpreterpattern.abstractexpression.Expression
import behavioralpatterns.interpreterpattern.abstractexpression.ExpressionName

class ExpressionProduct(private var expr1: Expression, private var expr2: Expression) : Expression {

    override fun interpret(context: Map<ExpressionName, Double>) = expr1.interpret(context) * expr2.interpret(context)
}