package creationalpatterns.abstractfactorypattern.repository.type.hypertext

import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryTeachers
import java.util.*

class RepositoryTeachersHypertext : RepositoryTeachers {
    override fun getTeacherList(): List<String> {
        return Arrays.asList("Teacher by Hypertext db")
    }
}