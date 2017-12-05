package structuralpatterns.adapterpattern.secondmodel

import java.util.*

interface StandardReservasACME {
    fun getInfoHotel(idHotel: String): String
    fun createReservation(fecha: Date, dias: Int, idHotel: String, cliente: String): String
    fun getReservation(codigo: String): String
}