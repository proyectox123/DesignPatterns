package behavioralpatterns.strategypattern.context

import behavioralpatterns.strategypattern.strategy.CompressionStrategy

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