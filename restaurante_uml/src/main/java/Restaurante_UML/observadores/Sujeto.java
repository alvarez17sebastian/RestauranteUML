package Restaurante_UML.observadores;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujeto {
    protected List<Observer> observadores = new ArrayList<>();

    public void agregarObservador(Observer observador){
        observadores.add(observador);
    }

    public void notificar(){
        for(Observer observador:observadores){
            observador.actualizar();
        }
    }

    public void suprimir(Observer observador){
        observadores.remove(observador);
    }
}
