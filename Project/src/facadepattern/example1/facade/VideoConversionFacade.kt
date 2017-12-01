package facadepattern.example1.facade

import facadepattern.example1.subsystem.audio.AudioMixer
import java.io.File
import facadepattern.example1.subsystem.bitratereader.BitrateReader
import facadepattern.example1.subsystem.codec.CodecFactory
import facadepattern.example1.subsystem.codec.Codec
import facadepattern.example1.subsystem.codec.VideoFile
import facadepattern.example1.subsystem.codec.MPEG4CompressionCodec
import facadepattern.example1.subsystem.codec.OggCompressionCodec


class VideoConversionFacade {
    fun convertVideo(fileName: String, format: String): File {
        println("****************VideoConversionFacade: conversion started.****************")
        val file = VideoFile(fileName)
        val sourceCodec = CodecFactory.extract(file)
        val destinationCodec: Codec = getDestinationCodec(format)
        val buffer = BitrateReader.read(file, sourceCodec)
        val intermediateResult = BitrateReader.convert(buffer, destinationCodec)
        val result = AudioMixer.fix(intermediateResult)
        println("****************VideoConversionFacade: conversion completed.****************")
        return result
    }

    private fun getDestinationCodec(format: String) = when (format) {
        "mp4" -> OggCompressionCodec()
        else -> MPEG4CompressionCodec()
    }
}