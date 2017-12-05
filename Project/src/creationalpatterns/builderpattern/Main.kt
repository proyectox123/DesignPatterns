package creationalpatterns.builderpattern

import creationalpatterns.builderpattern.model.Person

fun main(args: Array<String>) {
    val mother = Person.Builder("María")
            .country("México")
            .major(37)
            .workplace("Google")
            .build()

    val son = Person.Builder("Pedro")
            .minor(4)
            .school("Private school")
            .build()

//  It doesn't compile
//    val fake = Person.Builder("Luisa")
//            .major(20)
//            .school("Other school")
//            .build()

    println("${mother.name} ${mother.school} ${mother.workplace}")
    println("${son.name} ${son.school} ${son.workplace}")
}