package proxypattern.example2.proxy

import proxypattern.example2.realsubject.RealCommandExecutor
import proxypattern.example2.subject.CommandExecutor

class CommandExecutorProxy(user: String, password: String) : CommandExecutor {

    private var isAdmin: Boolean = false
    private val executor: CommandExecutor

    init {
        if ("root" == user && "Superuser1" == password) isAdmin = true
        executor = RealCommandExecutor()
    }

    @Throws(Exception::class)
    override fun runCommand(cmd: String) {
        if (isAdmin) {
            executor.runCommand(cmd)
            return
        }

        if (cmd.trim { it <= ' ' }.startsWith("rm")) {
            throw Exception("rm command is not allowed for non-admin users.")
        } else {
            executor.runCommand(cmd)
        }
    }
}