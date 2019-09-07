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
public class Restaurante {
    private String nombreRestaurante = "";
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Restaurante(){

    }
    
    public Restaurante(String nombreRestaurante){
        this.nombreRestaurante = nombreRestaurante;
    }
    
    public Restaurante(String nombreRestaurante,List<Cliente> clientes){
        this.nombreRestaurante = nombreRestaurante;
        this.clientes = clientes;
    }
    
    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public List<Reserva> obtenerReservas(){
        reservas = new ArrayList<>();
        for(Cliente cliente:clientes){
            agregarReservas(cliente.obtenerReservas());
        }
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

    public void accept(Visitor visitor){
        System.out.println(visitor.visit(this));
    }

    @Override
    public String toString() {
        String contenido = "Nombre restaurante: " + nombreRestaurante + "\nNumero clientes: " + clientes.size() + 
                "\nListado de clientes: \n" +clientes;
        return contenido;
    }
}
