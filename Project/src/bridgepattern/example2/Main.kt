package bridgepattern.example2

import bridgepattern.example2.concreteimplementor.Tienda1Impl
import bridgepattern.example2.concreteimplementor.VendedorEmpresaImpl
import bridgepattern.example2.concreteimplementor.VendedorParticularImpl
import bridgepattern.example2.implementor.TiendaImpl

fun main(args: Array<String>) {
    usingParticularSeller()
    usingCompanySeller()
    usingShop()
}

private fun usingParticularSeller(){
    println("****************************************************************usingParticularSeller****************************************************************")
    val vendedorParticular = VendedorParticularImpl()
    vendedorParticular.compraProducto("Kotlin", 5)
    println(vendedorParticular.descripcionProducto("Kotlin"))
}

private fun usingCompanySeller(){
    println("****************************************************************usingCompanySeller****************************************************************")
    val vendedorEmpresa = VendedorEmpresaImpl()
    vendedorEmpresa.compraCaja("Java", 24)
    vendedorEmpresa.compraProducto("Java", 2)
    vendedorEmpresa.compraProducto("Java", 12, 6)
    vendedorEmpresa.descripcionProducto("Java")
}

private fun usingShop(){
    println("****************************************************************usingShop****************************************************************")
    val tienda1Impl = Tienda1Impl()
    tienda1Impl.compraCaja("Javascript", 120)
    tienda1Impl.compraProducto("Javascript", 16)
    tienda1Impl.descripcionProducto("Javascript")
}