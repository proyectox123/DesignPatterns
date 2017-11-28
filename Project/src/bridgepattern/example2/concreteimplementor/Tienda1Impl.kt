package bridgepattern.example2.concreteimplementor

import bridgepattern.example2.implementor.TiendaImpl

class Tienda1Impl : TiendaImpl {
    override fun descripcionProducto(producto: String) = "Tienda1Impl descripcionProducto producto: $producto"

    override fun compraProducto(nombre: String, cantidad: Int) {
        println("Tienda1Impl compraProducto nombre: $nombre cantidad: $cantidad")
    }

    override fun compraCaja(nombre: String, numeroProductosEnCaja: Int) {
        println("Tienda1Impl compraCaja nombre: $nombre numeroProductosEnCasa: $numeroProductosEnCaja")
    }
}