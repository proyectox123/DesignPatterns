package structuralpatterns.facadepattern.subsystem.codec


object CodecFactory {
    fun extract(file: VideoFile): Codec {
        val type = file.codecType
        return when (type) {
            "mp4" -> {
                println("CodecFactory: extracting mpeg audio...")
                MPEG4CompressionCodec()
            }
            else -> {
                println("CodecFactory: extracting ogg audio...")
                OggCompressionCodec()
            }
        }
    }
}