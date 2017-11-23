package builderpattern.builder

import builderpattern.model.Person

class BuilderMajor(private val person: Person) {

    fun workplace(workplace: String): BuilderMajor {
        this.person.workplace = workplace
        return this
    }

    fun build(): Person {
        return person
    }
}