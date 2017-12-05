package behavioralpatterns.command.receiver

interface FileSystemReceiver {
    fun openFile()
    fun writeFile()
    fun closeFile()
}