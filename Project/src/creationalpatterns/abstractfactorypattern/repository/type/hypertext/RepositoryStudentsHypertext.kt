package creationalpatterns.abstractfactorypattern.repository.type.hypertext

import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryStudents
import java.util.*

class RepositoryStudentsHypertext : RepositoryStudents {
    override fun getStudentList(): List<String> {
        return Arrays.asList("Student by Hypertext db")
    }
}