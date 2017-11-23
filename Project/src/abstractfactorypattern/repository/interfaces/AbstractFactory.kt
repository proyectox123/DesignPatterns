package abstractfactorypattern.repository.interfaces

import abstractfactorypattern.repository.interfaces.RepositoryCourses
import abstractfactorypattern.repository.interfaces.RepositoryStudents

interface AbstractFactory {
    fun createRepositoryStudents() : RepositoryStudents
    fun createRepositoryCourses() : RepositoryCourses
    fun createRepositoryTeachers() : RepositoryTeachers
}