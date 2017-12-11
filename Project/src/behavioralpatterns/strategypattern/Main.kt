package behavioralpatterns.strategypattern

import behavioralpatterns.strategypattern.concretestrategy.RarCompressionStrategy
import behavioralpatterns.strategypattern.concretestrategy.ZipCompressionStrategy
import behavioralpatterns.strategypattern.context.CompressionContext

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