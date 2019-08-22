/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.constantes.ConstanteTipoCliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.alvarez
 */
public class Cliente {
    private String cedula;
    private String nombre;
    private String tipoCliente;
    private List<Reserva> reservas = new ArrayList<>();
    
    public Cliente(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipoCliente = ConstanteTipoCliente.TIPO_CLIENTE_NORMAL;
    }
    
    public Cliente(String cedula, String nombre, String tipoCliente){
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }
    
    public List<Reserva> obtenerReservas(){
        return this.reservas;
    }
    
    public boolean realizarReserva(Reserva reserva){
        this.reservas.add(reserva);
        return true;
    }
    
    public void asignarTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        String content = "\nNombre: " + nombre + "\nCedula: " + cedula + "\nTipo cliente:" + tipoCliente +"\nReservas: " + reservas + "\n" ;
        return content;
    }
    
    
}
