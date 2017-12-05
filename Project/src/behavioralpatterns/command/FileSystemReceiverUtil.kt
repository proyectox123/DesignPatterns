package behavioralpatterns.command

import behavioralpatterns.command.receiver.UnixFileSystemReceiver
import behavioralpatterns.command.receiver.WindowsFileSystemReceiver
import behavioralpatterns.command.receiver.FileSystemReceiver


object FileSystemReceiverUtil {
    val underlyingFileSystem: FileSystemReceiver
        get() {
            val osName = System.getProperty("os.name")
            println("Underlying OS is:" + osName)
            return when {
                osName.contains("Windows") -> WindowsFileSystemReceiver()
                else -> UnixFileSystemReceiver()
            }
        }
}