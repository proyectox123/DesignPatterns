package behavioralpatterns.interpreterpattern.context

import behavioralpatterns.interpreterpattern.abstractexpression.Expression
import behavioralpatterns.interpreterpattern.abstractexpression.ExpressionName
import behavioralpatterns.interpreterpattern.concreteexpressions.ExpressionLiteral
import behavioralpatterns.interpreterpattern.concreteexpressions.ExpressionProduct
import behavioralpatterns.interpreterpattern.concreteexpressions.ExpressionSum
import behavioralpatterns.interpreterpattern.concreteexpressions.ExpressionVariable

class Interpreter(){

    fun getInterpreter(): Expression{
        val expressionArray = arrayOf(getProduct(ExpressionName.PRACTICA, 0.2),
                getProduct(ExpressionName.CONDUCTA, 0.1),
                getProduct(ExpressionName.EXAMEN, 0.7))

        return getSum(expressionArray.size, expressionArray)
    }

    private fun getSum(length: Int, expression: Array<ExpressionProduct>) : Expression{
        return when {
            length < 2 -> ExpressionLiteral(0.0)
            length == 2 -> ExpressionSum(expression[0], expression[1])
            else -> ExpressionSum(getSum(length-1, expression), expression[length-1])
        }
    }

    private fun getProduct(variable: ExpressionName, literal: Double) =
            ExpressionProduct(ExpressionVariable(variable), ExpressionLiteral(literal))

}