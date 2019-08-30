/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.Interfaces.IReserva;
import Restaurante_UML.constantes.ConstanteTipoCliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.alvarez
 */
public abstract class Cliente implements IReserva {
    protected String identificacion;
    protected String nombre;
    protected String tipoCliente;
    protected List<Reserva> reservas = new ArrayList<>();

    public Cliente(){

    }

    public Cliente(String identificacion, String nombre){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.tipoCliente = ConstanteTipoCliente.TIPO_CLIENTE_NORMAL;
    }
    
    public Cliente(String identificacion, String nombre, String tipoCliente){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }
    
    public List<Reserva> obtenerReservas(){
        return this.reservas;
    }
    
    protected boolean realizarReserva(Reserva reserva){
        if(reserva.verificarDisponibilidad()){
            this.reservas.add(reserva);
            verificarClienteVIP();
            System.out.println("Reserva # " +reserva.obtenerNumeroDeReserva()+ " exitosa");
        }else{
            System.out.println("Reserva # " +reserva.obtenerNumeroDeReserva()+ " no se pudo efectuar");
        }
        return true;
    }

    private void verificarClienteVIP(){
        if(reservas.size() >= 5){
            this.asignarTipoCliente(ConstanteTipoCliente.TIPO_CLIENTE_VIP);
        }
    }

    public int obtenerNumeroDeReservas(){
        return this.reservas.size();
    }
    
    public void asignarTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        String content = "\nNombre: " + nombre + "\nCedula: " + identificacion + "\nTipo cliente:" + tipoCliente +"\nReservas: " + reservas + "\n" ;
        return content;
    }
    
    
}
