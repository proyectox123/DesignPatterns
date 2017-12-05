package structuralpatterns.proxypattern.example2

import structuralpatterns.proxypattern.example2.proxy.CommandExecutorProxy
import structuralpatterns.proxypattern.example2.subject.CommandExecutor

fun main(args: Array<String>) {
    executeCommands("User", "whatever")
    executeCommands("root", "Superuser1")
}

private fun executeCommands(user: String, password: String){
    val executor: CommandExecutor = CommandExecutorProxy(user, password)
    try {
        executor.runCommand("ls -ltr")
        executor.runCommand(" rm -rf abc.pdf")
    } catch (e: Exception) {
        println("Exception Message::" + e.message)
    }
}