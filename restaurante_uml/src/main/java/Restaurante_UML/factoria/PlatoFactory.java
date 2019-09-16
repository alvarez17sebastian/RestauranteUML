package Restaurante_UML.factoria;

import Restaurante_UML.platos.Plato;
import Restaurante_UML.platos.PlatoCompleto;
import Restaurante_UML.platos.PlatoMedio;
import Restaurante_UML.constantes.ConstanteTipoPlato;

public class PlatoFactory {

    public static Plato obtenerPlato(String tipoPlato){
        switch (tipoPlato){
            case ConstanteTipoPlato.PLATO_COMPLETO:
                return new PlatoCompleto();
            case ConstanteTipoPlato.PLATO_MEDIO:
                return new PlatoMedio();
            default:
                return new PlatoCompleto();
        }
    }
}
