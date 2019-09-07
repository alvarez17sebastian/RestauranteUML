package Restaurante_UML;

import java.util.List;

public class CantidadDeReservas extends Visitor {

    @Override
    protected String visit(Restaurante restaurante) {
        return "Reservas totales: " + restaurante.obtenerReservas().size();
    }
}
