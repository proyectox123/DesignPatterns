package facadepattern.example1.subsystem.codec

class VideoFile(val name: String) {
    val codecType: String

    init {
        this.codecType = name.substring(name.indexOf(".") + 1, name.length)
    }
}