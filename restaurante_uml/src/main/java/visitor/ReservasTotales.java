package visitor;

import Restaurante_UML.Restaurante;
import visitor.VisitorRestaurante;

public class ReservasTotales extends VisitorRestaurante {

    @Override
    public String visit(Restaurante restaurante) {
        return "Reservas totales: " + restaurante.obtenerReservas().size();
    }
}
