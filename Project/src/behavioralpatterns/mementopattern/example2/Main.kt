package behavioralpatterns.mementopattern.example2

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var option = 0

    val bd = Database()

    bd.addRegister("Mauricio Hernández", 26, true)
    bd.addRegister("Francisco Oyarzábal", 27, true)
    bd.createBackup()

    bd.addRegister("Carol Lozada", 18, true)
    bd.addRegister("Ronald McDonald", 32, true)
    bd.createBackup()

    bd.addRegister("Test Tester", 33, false)
    bd.addRegister("User", 27, false)
    bd.createBackup()

    do {
        showMenu()
        option = scanner.nextInt()
        when(option){
            0 -> println("End of the program...")
            1 -> bd.showList()
            2 -> bd.clearDatabase()
            3 -> {
                showBackup(bd.getBackupSize())
                bd.getBackup(scanner.nextInt()-1)
            }
            else -> println("It's not a valid option! Try again...")
        }

    }while (option != 0)
}

private fun showMenu(){
    println("****************************************************************")
    println("Select option:")
    println("1. List.")
    println("2. Clear database.")
    println("3. Restore backup.")
    println("****************************************************************")
}

private fun showBackup(numberOfBackups: Int){
    println("There are $numberOfBackups backups.")
    println("Enter version of backup that you want:")
}