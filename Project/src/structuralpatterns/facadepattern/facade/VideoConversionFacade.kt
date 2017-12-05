package structuralpatterns.facadepattern.facade

import structuralpatterns.facadepattern.subsystem.audio.AudioMixer
import java.io.File
import structuralpatterns.facadepattern.subsystem.bitratereader.BitrateReader
import structuralpatterns.facadepattern.subsystem.codec.CodecFactory
import structuralpatterns.facadepattern.subsystem.codec.Codec
import structuralpatterns.facadepattern.subsystem.codec.VideoFile
import structuralpatterns.facadepattern.subsystem.codec.MPEG4CompressionCodec
import structuralpatterns.facadepattern.subsystem.codec.OggCompressionCodec


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