package facadepattern.example1

import facadepattern.example1.facade.VideoConversionFacade

fun main(args: Array<String>) {
    val converter = VideoConversionFacade()
    converter.convertVideo("youtubevideo.ogg", "mp4")
}