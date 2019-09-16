/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.repositorio.menu.IRepositorioMenu;
import Restaurante_UML.repositorio.menu.RepositorioMenuImplementacion;
import Restaurante_UML.repositorio.reservas.IRepositorioReservas;
import Restaurante_UML.repositorio.reservas.RepositorioReservasImplementacion;
import visitor.VisitorRestaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.alvarez
 */
public class Restaurante {
    private String nombreRestaurante = "";
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas;
    private List<Receta> menu;
    private IRepositorioReservas iRepositorioReservas;
    IRepositorioMenu repositorioMenu;


    public Restaurante(){
        iRepositorioReservas = new RepositorioReservasImplementacion();
        reservas = iRepositorioReservas.cargarReservas();

        repositorioMenu = new RepositorioMenuImplementacion();
        menu = repositorioMenu.cargarRecetas();
    }

    public List<Receta> obtenerMenu(){
        return this.menu;
    }
    
    public Restaurante(String nombreRestaurante){
        this.nombreRestaurante = nombreRestaurante;
        IRepositorioReservas iRepositorioReservas = new RepositorioReservasImplementacion();
        reservas = iRepositorioReservas.cargarReservas();
        repositorioMenu = new RepositorioMenuImplementacion();
        menu = repositorioMenu.cargarRecetas();
    }

    public boolean realizarReserva(Cliente cliente){
        for(Reserva reserva:reservas){
            if(reserva.obtenerDisponibilidad()){
                reserva.asignarCliente(cliente);
                return true;
            }
        }
        return false;
    }

    public void liberarReserva(Cliente cliente){
        List<Reserva> reservasNoDisponibles = reservasNoDisponibles();
        for(Reserva reserva : reservasNoDisponibles){
            if(reserva.obtenerCliente().identificacion.equals(cliente.identificacion)){
                reserva.liberarReserva();
                break;
            }
        }
    }

    private List<Reserva> reservasNoDisponibles(){
        List<Reserva> reservasNoDisponibles = new ArrayList<>();
        for(Reserva reserva:reservas){
            if(!reserva.obtenerDisponibilidad()){
                reservasNoDisponibles.add(reserva);
            }
        }
        return reservasNoDisponibles;
    }


    public String obtenerNombre(){
        return this.nombreRestaurante;
    }
    
    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public List<Reserva> obtenerReservas(){
        return reservas;
    }

    public List<Cliente> obtenerClientes(){
        return this.clientes;
    }

    private void agregarReservas(List<Reserva> listaReservas){
        for(Reserva reserva:listaReservas){
            reservas.add(reserva);
        }
    }

    public void accept(VisitorRestaurante visitorRestaurante){
        System.out.println(visitorRestaurante.visit(this));
    }

    @Override
    public String toString() {
        String contenido = "Nombre restaurante: " + nombreRestaurante + "\nNumero clientes: " + clientes.size() + 
                "\nListado de clientes: \n" +clientes;
        return contenido;
    }
}
