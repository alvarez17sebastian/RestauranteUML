package Restaurante_UML.repositorio.reservas;

import Restaurante_UML.Interfaces.IReservable;
import Restaurante_UML.Motivo;
import Restaurante_UML.Reserva;
import Restaurante_UML.constantes.ConstanteItemReservable;
import Restaurante_UML.factoria.ItemReservableFactory;

import java.util.ArrayList;
import java.util.List;

public class RepositorioReservasImplementacion implements IRepositorioReservas {

    private List<Reserva> reservas = new ArrayList<>();

    @Override
    public List<Reserva> cargarReservas() {
        reservas = construirReservas();
        return reservas;
    }


    private List<Reserva> construirReservas(){

        List<Reserva> data = new ArrayList<>();

        Reserva reserva1 = new Reserva("1",obtenerElemento(),new Motivo("Motivo reserva 1","desc"));
        data.add(reserva1);

        Reserva reserva2 = new Reserva("2",obtenerElemento(),new Motivo("Motivo reserva 2","desc"));
        data.add(reserva2);

        Reserva reserva3 = new Reserva("3",obtenerElemento(),new Motivo("Motivo reserva 3","desc"));
        data.add(reserva3);

        Reserva reserva4 = new Reserva("4",obtenerElemento(),new Motivo("Motivo reserva 4","desc"));
        data.add(reserva4);

        return data;
    }

    private IReservable obtenerElemento(){
        return ItemReservableFactory.obtenerItemReservable(ConstanteItemReservable.TIPO_MESA);
    }
}
