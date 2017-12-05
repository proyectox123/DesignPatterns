package behavioralpatterns.command.receiver

class WindowsFileSystemReceiver : FileSystemReceiver {
    override fun openFile() {
        println("Opening file in Windows OS")
    }

    override fun writeFile() {
        println("Writing file in Windows OS")
    }

    override fun closeFile() {
        println("Closing file in Windows OS")
    }
}