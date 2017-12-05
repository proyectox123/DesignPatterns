package structuralpatterns.facadepattern

import structuralpatterns.facadepattern.facade.VideoConversionFacade

fun main(args: Array<String>) {
    val converter = VideoConversionFacade()
    converter.convertVideo("youtubevideo.ogg", "mp4")
}