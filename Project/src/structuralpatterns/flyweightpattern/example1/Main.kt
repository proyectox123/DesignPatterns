package structuralpatterns.flyweightpattern.example1

private val ROWS = 9
private val COLS = 10

fun main(args: Array<String>) {

    val factory = FactoryRow(ROWS)
    (0 until ROWS).forEach { i ->
        (0 until COLS).forEach { j ->
            factory.getFlyweight(i)?.report(j)
        }
    }
}