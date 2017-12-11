package behavioralpatterns.strategypattern.strategy

interface CompressionStrategy {
    fun compressFiles(files: List<String>)
}