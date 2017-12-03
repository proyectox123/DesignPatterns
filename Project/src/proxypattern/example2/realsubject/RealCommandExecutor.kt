package proxypattern.example2.realsubject

import proxypattern.example2.subject.CommandExecutor
import java.io.IOException

class RealCommandExecutor : CommandExecutor {

    @Throws(IOException::class)
    override fun runCommand(cmd: String) {
        Runtime.getRuntime().exec(cmd)
        println("'$cmd' command executed.")
    }

}