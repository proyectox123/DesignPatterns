package abstractfactorypattern.repository.type.objectmodel

import abstractfactorypattern.repository.interfaces.RepositoryStudents
import java.util.*

class RepositoryStudentsObjectModel : RepositoryStudents {
    override fun getStudentList(): List<String> {
        return Arrays.asList("Student by ObjectModel db")
    }
}