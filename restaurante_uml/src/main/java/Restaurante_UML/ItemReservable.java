package Restaurante_UML;

import Restaurante_UML.Interfaces.IReservable;
import Restaurante_UML.constantes.ConstantesTipoMesa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class ItemReservable implements IReservable {
    protected List<ElementoConfort> elementosConfort = new ArrayList<>();

    public void agregarElementoDeConfort(ElementoConfort elementoConfort){
        elementosConfort.add(elementoConfort);
        establecerAmbienteDeElemento();
    }

    protected void asignarAmbiente(List<ElementoConfort> elementosConfort){
        for(ElementoConfort element: elementosConfort){
            element.indicarAmbiente("ambiente: " + UUID.randomUUID().toString());
        }
    }
    

    protected abstract void establecerAmbienteDeElemento();
}
