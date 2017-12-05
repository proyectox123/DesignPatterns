package creationalpatterns.abstractfactorypattern.repository.type.objectmodel

import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryTeachers
import java.util.*

class RepositoryTeachersObjectModel : RepositoryTeachers {
    override fun getTeacherList(): List<String> {
        return Arrays.asList("Teacher by ObjectModel db")
    }
}