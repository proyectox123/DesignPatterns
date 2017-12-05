package creationalpatterns.abstractfactorypattern.repository.type.objectmodel

import creationalpatterns.abstractfactorypattern.repository.interfaces.AbstractFactory
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryCourses
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryStudents
import creationalpatterns.abstractfactorypattern.repository.interfaces.RepositoryTeachers

class FactoryObjectModel : AbstractFactory {
    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsObjectModel()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesObjectModel()
    }

    override fun createRepositoryTeachers(): RepositoryTeachers {
        return RepositoryTeachersObjectModel()
    }
}