package abstractfactorypattern.repository.type.nosql

import abstractfactorypattern.repository.interfaces.RepositoryCourses
import java.util.*

class RepositoryCoursesNoSQL : RepositoryCourses {
    override fun getCourseList(): List<String> {
        return Arrays.asList("Course by NoSQL db")
    }
}