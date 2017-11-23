package abstractfactorypattern

import abstractfactorypattern.repository.type.hypertext.FactoryHypertext
import abstractfactorypattern.repository.type.nosql.FactoryNoSQL
import abstractfactorypattern.repository.type.objectmodel.FactoryObjectModel
import abstractfactorypattern.repository.type.relational.FactoryRelational

fun main(args: Array<String>) {
    manageRepository()
}

private fun manageRepository(){
    manageRepositoryRelational()
    manageRepositoryObjectModel()
    manageRepositoryNoSQL()
    manageRepositoryHypertext()
}

/*****************************************************************************/
private fun manageRepositoryRelational(){
    println("----------------------------------------------------------------")
    println("* manageRepositoryRelational:")
    val factory = FactoryRelational()
    showStudentList(factory.createRepositoryStudents().getStudentList())
    showCourseList(factory.createRepositoryCourses().getCourseList())
    showTeacherList(factory.createRepositoryTeachers().getTeacherList())
}

private fun manageRepositoryObjectModel(){
    println("----------------------------------------------------------------")
    println("* manageRepositoryObjectModel:")
    val factory = FactoryObjectModel()
    showStudentList(factory.createRepositoryStudents().getStudentList())
    showCourseList(factory.createRepositoryCourses().getCourseList())
    showTeacherList(factory.createRepositoryTeachers().getTeacherList())
}

private fun manageRepositoryNoSQL(){
    println("----------------------------------------------------------------")
    println("* manageRepositoryNoSQL:")
    val factory = FactoryNoSQL()
    showStudentList(factory.createRepositoryStudents().getStudentList())
    showCourseList(factory.createRepositoryCourses().getCourseList())
    showTeacherList(factory.createRepositoryTeachers().getTeacherList())
}

private fun manageRepositoryHypertext(){
    println("----------------------------------------------------------------")
    println("* manageRepositoryHypertext:")
    val factory = FactoryHypertext()
    showStudentList(factory.createRepositoryStudents().getStudentList())
    showCourseList(factory.createRepositoryCourses().getCourseList())
    showTeacherList(factory.createRepositoryTeachers().getTeacherList())
}

/*****************************************************************************/
private fun showStudentList(studentList: List<String>) {
    studentList.forEach {
        println(it)
    }
}

private fun showCourseList(courseList: List<String>) {
    courseList.forEach {
        println(it)
    }
}

private fun showTeacherList(teacherList: List<String>) {
    teacherList.forEach {
        println(it)
    }
}