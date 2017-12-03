package proxypattern.example2.subject

interface CommandExecutor {
    @Throws(Exception::class)
    fun runCommand(cmd: String)
}