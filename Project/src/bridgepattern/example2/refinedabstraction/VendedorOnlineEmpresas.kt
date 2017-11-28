package bridgepattern.example2.refinedabstraction

import bridgepattern.example2.abstraction.VendedorOnline

interface VendedorOnlineEmpresas : VendedorOnline {
    fun compraProducto(nombre: String, cantidadPorCaja: Int, cajas: Int)
}