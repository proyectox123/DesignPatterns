package bridgepattern.example2.refinedabstraction

import bridgepattern.example2.abstraction.VendedorOnline

interface VendedorOnlineParticulares : VendedorOnline {
    fun compraProducto(nombre: String, cantidad: Int)
}