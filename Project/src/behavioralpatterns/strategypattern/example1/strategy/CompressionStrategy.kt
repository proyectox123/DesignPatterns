package behavioralpatterns.strategypattern.example1.strategy

interface CompressionStrategy {
    fun compressFiles(files: List<String>)
}