package abstractfactorypattern.repository.type.nosql

import abstractfactorypattern.repository.interfaces.RepositoryTeachers
import java.util.*

class RepositoryTeachersNoSQL : RepositoryTeachers {
    override fun getTeacherList(): List<String> {
        return Arrays.asList("Teacher by NoSQL db")
    }
}