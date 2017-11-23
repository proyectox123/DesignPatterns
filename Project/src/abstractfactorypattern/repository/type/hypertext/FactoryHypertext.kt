package abstractfactorypattern.repository.type.hypertext

import abstractfactorypattern.repository.interfaces.AbstractFactory
import abstractfactorypattern.repository.interfaces.RepositoryCourses
import abstractfactorypattern.repository.interfaces.RepositoryStudents
import abstractfactorypattern.repository.interfaces.RepositoryTeachers

class FactoryHypertext : AbstractFactory {
    override fun createRepositoryTeachers(): RepositoryTeachers {
        return RepositoryTeachersHypertext()
    }

    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsHypertext()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesHypertext()
    }

}