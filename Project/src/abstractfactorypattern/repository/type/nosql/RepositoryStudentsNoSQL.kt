package abstractfactorypattern.repository.type.nosql

import abstractfactorypattern.repository.interfaces.RepositoryStudents
import java.util.*

class RepositoryStudentsNoSQL : RepositoryStudents {
    override fun getStudentList(): List<String> {
        return Arrays.asList("Student by NoSQL db")
    }
}