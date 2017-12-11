package behavioralpatterns.strategypattern.example1.concretestrategy

import behavioralpatterns.strategypattern.example1.strategy.CompressionStrategy

class ZipCompressionStrategy : CompressionStrategy {
    override fun compressFiles(files: List<String>) {
        files.forEach {
            println("Using zip compression strategy for $it file")
        }
    }
}