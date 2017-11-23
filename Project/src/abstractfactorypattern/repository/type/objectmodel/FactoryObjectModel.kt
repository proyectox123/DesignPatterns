package abstractfactorypattern.repository.type.objectmodel

import abstractfactorypattern.repository.interfaces.AbstractFactory
import abstractfactorypattern.repository.interfaces.RepositoryCourses
import abstractfactorypattern.repository.interfaces.RepositoryStudents

class FactoryObjectModel : AbstractFactory {
    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsObjectModel()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesObjectModel()
    }
}