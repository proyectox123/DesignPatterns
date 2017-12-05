package structuralpatterns.bridgepattern.example2.concreteimplementor

import structuralpatterns.bridgepattern.example2.refinedabstraction.VendedorOnlineParticulares

class VendedorParticularImpl : VendedorOnlineParticulares {

    override fun compraProducto(nombre: String, cantidad: Int) {
        println("VendedorParticularImpl1 compraProducto nombre: $nombre cantidad: $cantidad")
    }

    override fun descripcionProducto(producto: String) = "VendedorParticularImpl1 descripcionProducto producto: $producto"
}