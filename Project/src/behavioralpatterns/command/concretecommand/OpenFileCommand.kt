package behavioralpatterns.command.concretecommand

import behavioralpatterns.command.receiver.FileSystemReceiver
import behavioralpatterns.command.command.Command

class OpenFileCommand(private val fileSystem: FileSystemReceiver) : Command {
    override fun execute() {
        this.fileSystem.openFile()
    }
}