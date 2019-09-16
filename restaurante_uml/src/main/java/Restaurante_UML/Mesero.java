package Restaurante_UML;

import Restaurante_UML.platos.Plato;

public class Mesero {

    private Cocina cocina;
    private Cliente cliente;

    public Mesero(Cliente cliente){
        this.cliente = cliente;
        this.cocina = new Cocina();
    }

    public Plato hacerPedido(Receta receta, String tipoPlato){
        return cocina.cocinar(receta,tipoPlato);
    }
}
