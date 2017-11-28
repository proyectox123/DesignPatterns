package bridgepattern.example2.implementor

interface TiendaImpl {
    fun descripcionProducto(producto: String): String
    fun compraProducto(nombre: String, cantidad: Int)
    fun compraCaja(nombre: String, numeroProductosEnCaja: Int)
}