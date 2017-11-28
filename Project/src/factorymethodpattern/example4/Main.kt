package factorymethodpattern.example4

fun main(args: Array<String>) {
    var validator : Validator = CreatorValidator.getConcreteCreate(ValidatorCriteria.PASSWORD)
    println("Is paramater 123456 valid? -> ${validator.isParamValid("123456")}")

    validator = CreatorValidator.getConcreteCreate(ValidatorCriteria.NAME)
    println("Is paramater Mau valid? -> ${validator.isParamValid("Mau")}")
    println("Is paramater MauMauMauMauMau valid? -> ${validator.isParamValid("MauMauMauMauMau")}")
    println("Is paramater 123456 valid? -> ${validator.isParamValid("123456")}")
}