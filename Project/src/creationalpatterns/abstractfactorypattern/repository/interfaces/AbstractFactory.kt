package creationalpatterns.abstractfactorypattern.repository.interfaces

interface AbstractFactory {
    fun createRepositoryStudents() : RepositoryStudents
    fun createRepositoryCourses() : RepositoryCourses
    fun createRepositoryTeachers() : RepositoryTeachers
}