package factorymethodpattern.example4

class CreatorValidator {
    companion object {
        fun getConcreteCreate(criteria: ValidatorCriteria) : Validator {
            return when {
                criteria == ValidatorCriteria.PASSWORD -> ConcreteCreatePassword()
                criteria == ValidatorCriteria.NAME -> ConcreteCreateName()
                else -> throw Exception("It is not a supported parameter!")
            }
        }
    }
}