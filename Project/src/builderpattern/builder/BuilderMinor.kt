package builderpattern.builder

import builderpattern.model.Person

class BuilderMinor(private val person: Person) {

    fun school(school: String): BuilderMinor {
        this.person.school = school
        return this
    }

    fun build(): Person {
        return person
    }
}