package structuralpatterns.bridgepattern.example2.concreteimplementor

import structuralpatterns.bridgepattern.example2.implementor.TiendaImpl
import structuralpatterns.bridgepattern.example2.refinedabstraction.VendedorOnlineEmpresas

class VendedorEmpresaImpl : TiendaImpl, VendedorOnlineEmpresas {

    override fun descripcionProducto(producto: String) = "VendedorEmpresaImpl descripcionProducto producto: $producto"

    override fun compraProducto(nombre: String, cantidad: Int) {
        println("VendedorEmpresaImpl compraProducto nombre: $nombre cantidad: $cantidad")
    }

    override fun compraCaja(nombre: String, numeroProductosEnCaja: Int) {
        println("VendedorEmpresaImpl compraCaja nombre: $nombre numeroProductosEnCaja: $numeroProductosEnCaja")
    }

    override fun compraProducto(nombre: String, cantidadPorCaja: Int, cajas: Int) {
        println("VendedorEmpresaImpl compraProducto nombre: $nombre cantidadPorCaja: $cantidadPorCaja cajas: $cajas")
        (0 until cajas).forEach { index ->
            print("VendedorEmpresaImpl compraProducto in loop($index)...")
            compraCaja(nombre, cantidadPorCaja)
        }
    }
}