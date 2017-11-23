package abstractfactorypattern.repository.type.relational

import abstractfactorypattern.repository.interfaces.AbstractFactory
import abstractfactorypattern.repository.interfaces.RepositoryCourses
import abstractfactorypattern.repository.interfaces.RepositoryStudents

class FactoryRelational : AbstractFactory {
    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsRelational()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesRelational()
    }

}