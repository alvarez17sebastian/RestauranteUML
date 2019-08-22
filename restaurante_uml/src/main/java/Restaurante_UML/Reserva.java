/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;

import Restaurante_UML.constantes.ConstantesTipoMesa;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author sebastian.alvarez
 */
public class Reserva {
    private String numeroReserva;
    private Mesa mesa;
    private String motivo;
    
    public Reserva(String numeroReserva,Mesa mesa,String motivo){
        this.numeroReserva = numeroReserva;
        this.mesa = mesa;
        this.motivo = motivo;
    }
    
    public void establecerAmbienteDeElemento(){
        if(mesa.obtenerTipoMesa().equals(ConstantesTipoMesa.MESA_LOUNGE)){
            asignarAmbiente(mesa.obtenerElementosDeConfort());
        }
    }
    
    private void asignarAmbiente(List<ElementoConfort> elementosConfort){
        for(ElementoConfort element: elementosConfort){
            element.indicarAmbiente("ambiente: " + UUID.randomUUID().toString());
        }
    }

    @Override
    public String toString() {
        String content = "Numero reserva: " + numeroReserva + "\nMesa: " + mesa + "\nMotivo: " + motivo;
        return content;
    }
    
    
}
