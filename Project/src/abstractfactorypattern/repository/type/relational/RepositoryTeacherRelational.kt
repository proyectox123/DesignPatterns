package abstractfactorypattern.repository.type.relational

import abstractfactorypattern.repository.interfaces.RepositoryTeachers
import java.util.*

class RepositoryTeacherRelational : RepositoryTeachers {
    override fun getTeacherList(): List<String> {
        return Arrays.asList("Teacher by Relational db")
    }
}