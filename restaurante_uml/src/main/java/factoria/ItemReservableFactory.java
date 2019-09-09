package factoria;

import Restaurante_UML.ItemReservable;
import Restaurante_UML.Mesa;
import Restaurante_UML.constantes.ConstanteItemReservable;

public class ItemReservableFactory {
    public ItemReservable obtenerItemReservable(int tipoItemReservable){
        switch (tipoItemReservable){
            case ConstanteItemReservable.TIPO_MESA:
                return new Mesa();
            default:
                return null;
        }
    }
}
