package behavioralpatterns.strategypattern.example1.context

import behavioralpatterns.strategypattern.example1.strategy.CompressionStrategy

class CompressionContext {

    private var strategy: CompressionStrategy? = null

    //this can be set at runtime by the application preferences
    fun setCompressionStrategy(strategy: CompressionStrategy) {
        this.strategy = strategy
    }

    //use the strategy
    fun createArchive(files: List<String>) {
        strategy?.compressFiles(files)
    }
}