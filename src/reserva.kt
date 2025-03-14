class reserva (
    var idreserva: Int,
    var idhuesped:Int,
    var nombrehuesped:String,
    var emailhuesped:String,
    var numerohabitacion:Int,
    var tipohabitacion: String,
    var precionoche:Int,
    var cantidadnoches:Int
)
{
    fun preciototal(){
        val precio= this.cantidadnoches * this.precionoche
        println("El precio total de la reserva $idhuesped es: $precio")
    }
    fun reservada(reserva: Boolean){
        val reserva=true
    }
    fun inforeserva(){
        println("""el  id de la reserva es$idreserva 
            |el id del huesped es $idhuesped+ 
            |"el nombre del huesped es: "$nombrehuesped 
            |el email del huesped es:$emailhuesped
            | el numero de habitacion es$numerohabitacion
               |el tipo de habitacion es $tipohabitacion
               |el precio por noche es $precionoche
               |la cantidad de noches es$cantidadnoches
               |""".trimMargin())
    }


}