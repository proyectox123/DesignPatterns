package creationalpatterns.builderpattern.model

class Person private constructor(){

    var name: String? = null
        private set
    var age: Int = 0
        private set
    var country: String? = null
        private set
    var school: String? = null
        private set
    var workplace: String? = null
        private set

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

    class BuilderMinor internal constructor(private val person: Person) {

        fun school(school: String): BuilderMinor {
            this.person.school = school
            return this
        }

        fun build(): Person {
            return person
        }
    }

    class BuilderMajor internal constructor(private val person: Person) {

        fun workplace(workplace: String): BuilderMajor {
            this.person.workplace = workplace
            return this
        }

        fun build(): Person {
            return person
        }
    }
}