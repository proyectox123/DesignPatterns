package behavioralpatterns.command.concretecommand

import behavioralpatterns.command.receiver.FileSystemReceiver
import behavioralpatterns.command.command.Command

class CloseFileCommand(private val fileSystem: FileSystemReceiver) : Command {
    override fun execute() {
        this.fileSystem.closeFile()
    }
}