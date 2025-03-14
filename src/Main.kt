//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listareserva= mutableListOf<reserva>()
    var opcion=0
    do {
        println("""
        bienvenido a la reserva de habitaciones (:, presione una opcion para continuar
        1 Registrar una reserva 
        2 Cancelar una reserva 
        3 Mostrar las reservas activas   
        4 Salir
    """.trimIndent())
        opcion= readln().toInt()
        when(opcion){
            1->{
                println("vas a registar una resrva")
                println("ingresa el id de la reserva ")
                val idreserva= readln().toInt()
                println("ingresa el id del huesped")
                val idhuesped= readln().toInt()
                println("ingresa el nombre del huesped")
                val nombrehuesped= readln()
                println("ingresa el email del huesped")
                val correoh= readln()
                println("ingresa el numero de la habitacion")
                val nhabitacion= readln().toInt()
                println("ingresa el tipo de habitacion")
                val tipoh= readln()
                println("ingresa el precio por noche de la habitacion")
                val precion= readln().toInt()
                println("ingresa la cantidad de noches que se va a reservar")
                val cantinoches= readln().toInt()
                listareserva.add(reserva(idreserva,idhuesped,nombrehuesped,correoh,nhabitacion,tipoh,precion,cantinoches))
            }
            2->{
                println("ingresa el id de la reserva a cancelar ")
                val idreserva = readln().toInt()
                if(listareserva.removeIf({it.idreserva == idreserva})){
                    println("reserva eliminada (:")
                }else{
                    println("reserva no encontrada")
                }
            }
            3->{
                listareserva.forEach({it.inforeserva()})
                listareserva.forEach(({it.preciototal()}))
            }
            4->{
                println("saliendo del programa de reservas")
            }
        }
    } while(opcion!=4)
}