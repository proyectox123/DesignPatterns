package behavioralpatterns.strategypattern.concretestrategy

import behavioralpatterns.strategypattern.strategy.CompressionStrategy

class ZipCompressionStrategy : CompressionStrategy {
    override fun compressFiles(files: List<String>) {
        files.forEach {
            println("Using zip compression strategy for $it file")
        }
    }
}