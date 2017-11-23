package abstractfactorypattern.repository.type.objectmodel

import abstractfactorypattern.repository.interfaces.RepositoryCourses
import java.util.*

class RepositoryCoursesObjectModel : RepositoryCourses {
    override fun getCourseList(): List<String> {
        return Arrays.asList("Course by ObjectModel db")
    }
}