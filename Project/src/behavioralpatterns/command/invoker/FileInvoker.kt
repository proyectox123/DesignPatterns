package behavioralpatterns.command.invoker

import behavioralpatterns.command.command.Command

class FileInvoker(var command: Command) {
    fun execute() {
        this.command.execute()
    }
}