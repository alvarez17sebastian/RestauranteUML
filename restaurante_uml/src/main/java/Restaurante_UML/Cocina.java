package Restaurante_UML;

import Restaurante_UML.Interfaces.IReservable;

import java.util.List;

public class Cocina implements IReservable {
    @Override
    public String obtenerNombreElemento() {
        return "cocina";
    }

    @Override
    public boolean verificarDisponibilidad(List<Reserva> reservas) {
        for (Reserva reserva : reservas) {
            if(reserva.obtenerElementoReservable().equals(this)){
                return  false;
            }
        }
        return true;
    }
}
