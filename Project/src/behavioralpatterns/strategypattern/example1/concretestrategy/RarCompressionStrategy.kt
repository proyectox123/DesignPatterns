package behavioralpatterns.strategypattern.example1.concretestrategy

import behavioralpatterns.strategypattern.example1.strategy.CompressionStrategy

class RarCompressionStrategy : CompressionStrategy {
    override fun compressFiles(files: List<String>) {
        files.forEach {
            println("Using rar compression strategy for $it file")
        }
    }
}