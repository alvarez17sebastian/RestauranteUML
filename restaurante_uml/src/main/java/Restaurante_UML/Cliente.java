/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.Interfaces.IReserva;
import Restaurante_UML.constantes.ConstanteTipoCliente;
import Restaurante_UML.observadores.Sujeto;
import Restaurante_UML.platos.Plato;
import com.sun.corba.se.spi.activation.InitialNameServiceOperations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.alvarez
 */
public abstract class Cliente extends Sujeto implements IReserva {
    protected String identificacion;
    protected String nombre;
    protected String tipoCliente;
    protected Mesero mesero;

    public Cliente(){
        mesero = new Mesero(this);
    }

    public Cliente(String identificacion, String nombre){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.tipoCliente = ConstanteTipoCliente.TIPO_CLIENTE_NORMAL;
        mesero = new Mesero(this);
    }

    public Plato hacerPedido(Receta receta, String tipoPlato){
        Plato plato = mesero.hacerPedido(receta,tipoPlato);
        this.notificar();
        return plato;
    }

    @Override
    public String toString() {
        String content = "\nNombre: " + nombre + "\nCedula: " + identificacion + "\nTipo cliente:" + tipoCliente;
        return content;
    }
    
}
