package Restaurante_UML.repositorio.reservas;

import Restaurante_UML.Reserva;

import java.util.List;

public interface IRepositorioReservas {
    List<Reserva> cargarReservas();
}
