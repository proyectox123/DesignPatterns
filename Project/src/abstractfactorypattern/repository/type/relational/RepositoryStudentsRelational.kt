package abstractfactorypattern.repository.type.relational

import abstractfactorypattern.repository.interfaces.RepositoryStudents
import java.util.*

class RepositoryStudentsRelational : RepositoryStudents {
    override fun getStudentList(): List<String> {
        return Arrays.asList("Student by Relational db")
    }
}