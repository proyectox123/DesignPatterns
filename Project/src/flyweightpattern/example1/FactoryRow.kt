package flyweightpattern.example1

class FactoryRow(maxRows: Int) {
    private var pool: Array<Row?> = arrayOfNulls(maxRows)

    fun getFlyweight(row: Int): Row? {
        if (pool[row] == null) {
            pool[row] = Row(row)
        }

        return pool[row]
    }
}