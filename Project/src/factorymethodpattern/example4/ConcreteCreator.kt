package factorymethodpattern.example4

class ConcreteCreateName : Validator {
    override fun isParamValid(parameterName: String) = parameterName.length > 10 && parameterName.contains("M")
}

class ConcreteCreatePassword : Validator {
    override fun isParamValid(parameterName: String) = parameterName.length > 5
}