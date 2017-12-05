package creationalpatterns.abstractfactorypattern.repository.type.hypertext

import creationalpatterns.abstractfactorypattern.repository.interfaces.AbstractFactory
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryCourses
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryStudents
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryTeachers

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