package creationalpatterns.abstractfactorypattern.repository.type.nosql

import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryTeachers
import java.util.*

class RepositoryTeachersNoSQL : RepositoryTeachers {
    override fun getTeacherList(): List<String> {
        return Arrays.asList("Teacher by NoSQL db")
    }
}