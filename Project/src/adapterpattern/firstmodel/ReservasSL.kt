package adapterpattern.firstmodel

import java.util.*

interface ReservasSL {
    fun hotelInfo(idHotel: String) : String
    fun creaReserva(idHotel: String, cliente: String, fecha: Date, dias: Int) : Long
    fun datosReserva(codigo: Long) : String
}