package abstractfactorypattern.repository.type.nosql

import abstractfactorypattern.repository.interfaces.AbstractFactory
import abstractfactorypattern.repository.interfaces.RepositoryCourses
import abstractfactorypattern.repository.interfaces.RepositoryStudents

class FactoryNoSQL : AbstractFactory {
    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsNoSQL()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesNoSQL()
    }
}