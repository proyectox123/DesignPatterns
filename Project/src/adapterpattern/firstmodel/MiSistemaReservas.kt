package adapterpattern.firstmodel

import java.util.*

open class MiSistemaReservas : ReservasSL {
    override fun hotelInfo(idHotel: String): String {
        return "Info from hotel with id $idHotel!"
    }

    override fun creaReserva(idHotel: String, cliente: String, fecha: Date, dias: Int): Long {
        println("Creating with params: $idHotel, $cliente, ${fecha.time}, $dias...")
        return (1234567890 + dias).toLong()//It is just an example
    }

    override fun datosReserva(codigo: Long): String {
        return "Data of reservation from code $codigo!"
    }

}