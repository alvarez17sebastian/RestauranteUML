package Restaurante_UML.factoria;

import Restaurante_UML.ItemReservable;
import Restaurante_UML.Mesa;
import Restaurante_UML.constantes.ConstanteItemReservable;
import Restaurante_UML.constantes.ConstantesTipoMesa;

import java.util.ArrayList;
import java.util.List;

public class ItemReservableFactory {

    public static ItemReservable obtenerItemReservable(int tipoItemReservable){
        switch (tipoItemReservable){
            case ConstanteItemReservable.TIPO_MESA:
                Mesa mesa = obtenerMesa();
                return mesa;
            default:
                return null;
        }
    }

    private static List<Mesa> obtenerMesas(){

        List<Mesa> mesas = new ArrayList<>();

        Mesa mesa1 = new Mesa("1", ConstantesTipoMesa.MESA_LOUNGE);
        mesas.add(mesa1);

        Mesa mesa2 = new Mesa("2", ConstantesTipoMesa.MESA_INDIVIDUAL);
        mesas.add(mesa2);

        Mesa mesa3 = new Mesa("3", ConstantesTipoMesa.MESA_GRUPAL);
        mesas.add(mesa3);

        return mesas;
    }

    private static Mesa obtenerMesa(){

        int index =(int) (Math.random() * 2);

        return  obtenerMesas().get(index);
    }
}
