package Restaurante_UML;

import Restaurante_UML.observadores.Observer;
import Restaurante_UML.platos.Plato;

public class Mesero implements Observer {

    private Cocina cocina;
    private Cliente cliente;

    public Mesero(Cliente cliente){
        this.cliente = cliente;
        this.cliente.agregarObservador(this);
        this.cocina = Cocina.obtenerInstancia();
    }

    public Plato hacerPedido(Receta receta, String tipoPlato){
        return cocina.cocinar(receta,tipoPlato);
    }

    @Override
    public void actualizar() {
        System.out.println("Un cliente acaba de solicitar un pedido");
    }
}
