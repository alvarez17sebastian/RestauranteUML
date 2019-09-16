package visitor;

import Restaurante_UML.Reserva;
import Restaurante_UML.Restaurante;
import visitor.VisitorRestaurante;

public class NumeroReservasRealizadas extends VisitorRestaurante {

    @Override
    public String visit(Restaurante restaurante) {

        int reservasRealizadas = 0;

        for(Reserva reserva : restaurante.obtenerReservas()){
            if(!reserva.obtenerDisponibilidad()){
                reservasRealizadas++;
            }
        }
        return "Reservas realizadas: " + reservasRealizadas;
    }
}
