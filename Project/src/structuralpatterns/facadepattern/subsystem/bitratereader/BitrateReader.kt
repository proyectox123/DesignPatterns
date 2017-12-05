package structuralpatterns.facadepattern.subsystem.bitratereader

import structuralpatterns.facadepattern.subsystem.codec.Codec
import structuralpatterns.facadepattern.subsystem.codec.VideoFile


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