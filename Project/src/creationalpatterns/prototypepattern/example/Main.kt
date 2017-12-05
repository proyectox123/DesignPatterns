package creationalpatterns.prototypepattern.example

fun main(args: Array<String>) {

    val base = Configuration(Element.ALIGN_CENTER,
            Element.ALIGN_MIDDLE,
            FontFamily.HELVETICA,
            Font.BOLD,
            1)
    useBaseConfiguration(base)

    val colspan: Configuration? = Configuration.from(base)
    colspan?.let {
        colspan.colspan = 2
        colspan.style = Font.NORMAL
        useColSpan(colspan)
    }

    val colspanNormal: Configuration? = Configuration.from(base)
    colspanNormal?.let {
        colspanNormal.font = FontFamily.SANS_SERIF
        useColSpanNormal(colspanNormal)
    }
}

private fun useBaseConfiguration(conf: Configuration){
    conf.create("Course")
    conf.create("Teacher")
    println("Base - HashCode: ${System.identityHashCode(System.identityHashCode(conf))}")
}

private fun useColSpan(conf: Configuration){
    conf.create("Students")
    println("colspan2 - HashCode: ${System.identityHashCode(System.identityHashCode(conf))}")
}

private fun useColSpanNormal(conf: Configuration){
    conf.create("Student 1")
    conf.create("Student 2")
    conf.create("Student 3")
    conf.create("Student 4")
    println("colspan2Normal - HashCode: ${System.identityHashCode(System.identityHashCode(conf))}")
}