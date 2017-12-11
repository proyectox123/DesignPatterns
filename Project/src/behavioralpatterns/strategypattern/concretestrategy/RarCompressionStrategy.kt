package behavioralpatterns.strategypattern.concretestrategy

import behavioralpatterns.strategypattern.strategy.CompressionStrategy

class RarCompressionStrategy : CompressionStrategy {
    override fun compressFiles(files: List<String>) {
        files.forEach {
            println("Using rar compression strategy for $it file")
        }
    }
}