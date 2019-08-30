package Restaurante_UML.Interfaces;

import Restaurante_UML.Reserva;

import java.util.List;

public interface IReservable {
    String obtenerNombreElemento();
    boolean verificarDisponibilidad(List<Reserva> reservas);
}
