package structuralpatterns.facadepattern.subsystem.audio

import java.io.File
import structuralpatterns.facadepattern.subsystem.codec.VideoFile


object AudioMixer {
    fun fix(result: VideoFile): File {
        println("AudioMixer: fixing audio...")
        return File("tmp")
    }
}