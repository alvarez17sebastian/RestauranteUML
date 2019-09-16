/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;

import Restaurante_UML.Interfaces.IReserva;
import Restaurante_UML.Interfaces.IReservable;
import Restaurante_UML.constantes.ConstantesTipoMesa;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author sebastian.alvarez
 */
public class Reserva{

    //private Restaurante restaurante;
    private String numeroReserva;
    private IReservable elementoReservable;
    private Motivo motivo;
    private Cliente cliente;
    private boolean disponible = true;
    
    public Reserva(String numeroReserva,IReservable elementoReservable, Motivo motivo){
        this.numeroReserva = numeroReserva;
        this.elementoReservable = elementoReservable;
        this.motivo = motivo;
        //this.restaurante = restaurante;

    }

    public boolean obtenerDisponibilidad(){
        return this.disponible;
    }

    public void asignarDisponibilildad(boolean disponibilidad){
        this.disponible = disponibilidad;
    }

    public Cliente obtenerCliente(){
        return this.cliente;
    }


    public void asignarCliente(Cliente cliente){
        this.cliente = cliente;
        disponible = false;
    }

    public void liberarReserva(){
        this.cliente = null;
        disponible = true;
    }

    public IReservable obtenerElementoReservable(){
        return this.elementoReservable;
    }

    public String obtenerNumeroDeReserva(){
        return this.numeroReserva;
    }

    @Override
    public String toString() {
        String content = "Numero reserva: " + numeroReserva + "\nMesa: " + elementoReservable + "\nMotivo: " + motivo;
        return content;
    }

}
