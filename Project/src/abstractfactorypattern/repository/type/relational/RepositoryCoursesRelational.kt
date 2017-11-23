package abstractfactorypattern.repository.type.relational

import abstractfactorypattern.repository.interfaces.RepositoryCourses
import java.util.*

class RepositoryCoursesRelational : RepositoryCourses {
    override fun getCourseList(): List<String> {
        return Arrays.asList("Course by Relational db")
    }
}