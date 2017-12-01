package facadepattern.example1.subsystem.bitratereader

import facadepattern.example1.subsystem.codec.Codec
import facadepattern.example1.subsystem.codec.VideoFile


object BitrateReader {
    fun read(file: VideoFile, codec: Codec): VideoFile {
        println("BitrateReader: reading file...")
        return file
    }

    fun convert(buffer: VideoFile, codec: Codec): VideoFile {
        println("BitrateReader: writing file...")
        return buffer
    }
}