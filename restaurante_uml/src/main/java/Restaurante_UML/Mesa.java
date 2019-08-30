/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;

import Restaurante_UML.Interfaces.IReservable;
import Restaurante_UML.constantes.ConstanteNombreElemento;
import Restaurante_UML.constantes.ConstantesTipoMesa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author sebastian.alvarez
 */
public class Mesa implements IReservable {
    private String numeroMesa;
    private String tipoMesa;
    private List<ElementoConfort> elementosConfort = new ArrayList<>();
    
    public Mesa(String numeroMesa,String tipoMesa){
        this.numeroMesa = numeroMesa;
        this.tipoMesa = tipoMesa;

    }
    
    public void agregarElementoDeConfort(ElementoConfort elementoConfort){
        elementosConfort.add(elementoConfort);
        establecerAmbienteDeElemento();
    }

    public String obtenerNumeroMesa(){
        return  this.numeroMesa;
    }


    private void establecerAmbienteDeElemento(){
        if(this.tipoMesa.equals(ConstantesTipoMesa.MESA_LOUNGE)){
            asignarAmbiente(elementosConfort);
        }
    }

    private void asignarAmbiente(List<ElementoConfort> elementosConfort){
        for(ElementoConfort element: elementosConfort){
            element.indicarAmbiente("ambiente: " + UUID.randomUUID().toString());
        }
    }

    @Override
    public String toString() {
        String content = "Numero mesa: " + numeroMesa + "\nTipo mesa: " + tipoMesa + "\nElementos de confort: " + elementosConfort;
        return content;
    }

    @Override
    public String obtenerNombreElemento() {
        return ConstanteNombreElemento.ELEMENTO_MESA;
    }

    @Override
    public boolean verificarDisponibilidad(List<Reserva> reservas) {
        for (Reserva reserva : reservas) {
           if(reserva.obtenerElementoReservable().equals(this)){
               return  false;
           }
        }
        return true;
    }
}
