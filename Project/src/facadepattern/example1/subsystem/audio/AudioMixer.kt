package facadepattern.example1.subsystem.audio

import java.io.File
import facadepattern.example1.subsystem.codec.VideoFile


object AudioMixer {
    fun fix(result: VideoFile): File {
        println("AudioMixer: fixing audio...")
        return File("tmp")
    }
}