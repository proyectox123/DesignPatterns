package creationalpatterns.abstractfactorypattern.repository.type.relational

import creationalpatterns.abstractfactorypattern.repository.interfaces.AbstractFactory
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryCourses
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryStudents
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryTeachers

class FactoryRelational : AbstractFactory {
    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsRelational()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesRelational()
    }

    override fun createRepositoryTeachers(): RepositoryTeachers {
        return RepositoryTeacherRelational()
    }
}