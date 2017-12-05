package behavioralpatterns.command

import behavioralpatterns.command.invoker.FileInvoker
import behavioralpatterns.command.concretecommand.CloseFileCommand
import behavioralpatterns.command.concretecommand.OpenFileCommand
import behavioralpatterns.command.receiver.FileSystemReceiver
import behavioralpatterns.command.concretecommand.WriteFileCommand

fun main(args: Array<String>) {
    val receiver = FileSystemReceiverUtil.underlyingFileSystem

    openFile(receiver)
    writeFile(receiver)
    closeFile(receiver)
}

private fun openFile(fs: FileSystemReceiver){
    val openFileCommand = OpenFileCommand(fs)
    val file = FileInvoker(openFileCommand)
    file.execute()
}

private fun writeFile(fs: FileSystemReceiver){
    val writeFileCommand = WriteFileCommand(fs)
    val file = FileInvoker(writeFileCommand)
    file.execute()
}

private fun closeFile(fs: FileSystemReceiver) {
    val closeFileCommand = CloseFileCommand(fs)
    val file = FileInvoker(closeFileCommand)
    file.execute()
}