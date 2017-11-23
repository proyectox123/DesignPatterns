package abstractfactorypattern.repository.type.hypertext

import abstractfactorypattern.repository.interfaces.AbstractFactory
import abstractfactorypattern.repository.interfaces.RepositoryCourses
import abstractfactorypattern.repository.interfaces.RepositoryStudents

class FactoryHypertext : AbstractFactory {
    override fun createRepositoryStudents(): RepositoryStudents {
        return RepositoryStudentsHypertext()
    }

    override fun createRepositoryCourses(): RepositoryCourses {
        return RepositoryCoursesHypertext()
    }

}