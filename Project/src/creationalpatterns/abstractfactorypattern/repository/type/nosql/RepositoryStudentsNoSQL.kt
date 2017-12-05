package creationalpatterns.abstractfactorypattern.repository.type.nosql

import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryStudents
import java.util.*

class RepositoryStudentsNoSQL : RepositoryStudents {
    override fun getStudentList(): List<String> {
        return Arrays.asList("Student by NoSQL db")
    }
}