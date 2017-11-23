package abstractfactorypattern.repository.type.hypertext

import abstractfactorypattern.repository.interfaces.RepositoryCourses
import java.util.*

class RepositoryCoursesHypertext : RepositoryCourses {
    override fun getCourseList(): List<String> {
        return Arrays.asList("Course by Hypertext db")
    }
}