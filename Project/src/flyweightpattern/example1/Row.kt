package flyweightpattern.example1

class Row(private val row: Int) {

    init {
        println("\nRow: ${this.row}")
    }

    fun report(col: Int) {
        print(" $row$col")
    }
}