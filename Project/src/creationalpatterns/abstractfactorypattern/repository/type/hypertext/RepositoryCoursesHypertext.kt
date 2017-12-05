package creationalpatterns.abstractfactorypattern.repository.type.hypertext

import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryCourses
import java.util.*

class RepositoryCoursesHypertext : RepositoryCourses {
    override fun getCourseList(): List<String> {
        return Arrays.asList("Course by Hypertext db")
    }
}