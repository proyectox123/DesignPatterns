package adapterpattern

import adapterpattern.adapter.ClassAdapter
import adapterpattern.firstmodel.MiSistemaReservas
import java.util.*

fun main(args: Array<String>) {
    firstSystemExample()
    secondSystemExample()
}

private fun firstSystemExample(){
    println("Mi Sistema Reservas:")
    val miSistemaReservas = ClassAdapter()
    println(miSistemaReservas.hotelInfo("1"))
    val code = miSistemaReservas.creaReserva("1", "Client Test", Date(), 14)
    println("${miSistemaReservas.datosReserva(code)} \n")
}

private fun secondSystemExample(){
    println("Standard Reservas ACME:")
    val standardReservasACME = ClassAdapter()
    println(standardReservasACME.hotelInfo("A"))
    val code = standardReservasACME.createReservation(Date(), 5, "A", "Client ACME")
    println(standardReservasACME.getReservation(code))
}