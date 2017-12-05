package creationalpatterns.abstractfactorypattern.repository.type.nosql

import creationalpatterns.abstractfactorypattern.repository.interfaces.AbstractFactory
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryCourses
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryStudents
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryTeachers

class FactoryNoSQL : AbstractFactory {
    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsNoSQL()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesNoSQL()
    }

    override fun createRepositoryTeachers(): RepositoryTeachers {
        return RepositoryTeachersNoSQL()
    }
}