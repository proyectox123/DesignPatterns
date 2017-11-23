package builderpattern.model

import builderpattern.builder.BuilderMajor
import builderpattern.builder.BuilderMinor

class Person {

    var name: String? = null
    var age: Int = 0
    var country: String? = null
    var school: String? = null
    var workplace: String? = null

    open class Builder(name: String) {

        private val person: Person = Person()

        init {
            person.name = name
        }

        fun country(country: String): Builder {
            person.country = country
            return this
        }

        fun minor(age: Int): BuilderMinor {
            if (age >= 18) throw IllegalArgumentException("It's an adult! age: " + age)
            person.age = age
            return BuilderMinor(person)
        }

        fun major(age: Int): BuilderMajor {
            if (age < 18) throw IllegalArgumentException("It's a kid! age: " + age)
            person.age = age
            return BuilderMajor(person)
        }
    }
}