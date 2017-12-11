package behavioralpatterns.strategypattern.example1

import behavioralpatterns.strategypattern.example1.concretestrategy.RarCompressionStrategy
import behavioralpatterns.strategypattern.example1.concretestrategy.ZipCompressionStrategy
import behavioralpatterns.strategypattern.example1.context.CompressionContext

private enum class CompressionStrategyFlag {
    ZIP, RAR
}

fun main(args: Array<String>) {
    val ctx = CompressionContext()
    ctx.setCompressionStrategy(getCompressionStrategy(CompressionStrategyFlag.RAR))
    //ctx.setCompressionStrategy(getCompressionStrategy(CompressionStrategyFlag.ZIP))

    val fileList: List<String> = (1..10).map{
        "File $it"
    }

    ctx.createArchive(fileList)
}

private fun getCompressionStrategy(compressionStrategy: CompressionStrategyFlag) = when (compressionStrategy) {
    CompressionStrategyFlag.ZIP -> ZipCompressionStrategy()
    else -> RarCompressionStrategy()
}