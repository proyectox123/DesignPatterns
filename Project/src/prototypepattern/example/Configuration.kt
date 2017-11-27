package prototypepattern.example

class Configuration(var alignment: Element,
                    var valignment: Element,
                    var font: FontFamily,
                    var style: Font,
                    var colspan: Int) : Cloneable{

    fun create(name: String){
        println("Configuration create: $name -> " +
                "alignment: $alignment, " +
                "valignment: $valignment, " +
                "font: $font, " +
                "style: $style, " +
                "colspan: $colspan")
    }

    companion object {
        fun from(base: Configuration): Configuration? {
            return try {
                base.clone() as Configuration
            } catch (e: CloneNotSupportedException) {
                e.printStackTrace()
                println("CloneNotSupportedException")
                throw AssertionError()
            }
        }
    }
}

enum class Element {
    ALIGN_CENTER, ALIGN_MIDDLE
}

enum class FontFamily {
    HELVETICA, SANS_SERIF
}

enum class Font {
    BOLD, NORMAL, ITALIC
}