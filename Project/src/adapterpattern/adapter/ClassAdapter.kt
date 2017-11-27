package adapterpattern.adapter

import adapterpattern.firstmodel.MiSistemaReservas
import adapterpattern.secondmodel.StandardReservasACME
import java.util.*

class ClassAdapter : MiSistemaReservas(), StandardReservasACME {

    override fun getInfoHotel(idHotel: String) = hotelInfo(idHotel)

    override fun createReservation(fecha: Date, dias: Int, idHotel: String, cliente: String) =
            creaReserva(idHotel, cliente, fecha, dias).toString()

    override fun getReservation(codigo: String) = try {
            datosReserva(codigo.toLong())
        }catch (e: NumberFormatException){
            e.printStackTrace()
            ""
        }
}