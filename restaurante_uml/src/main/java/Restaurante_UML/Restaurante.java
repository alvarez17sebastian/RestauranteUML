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

    @Override
    public String toString() {
        String contenido = "Nombre restaurante: " + nombreRestaurante + "\nNumero clientes: " + clientes.size() + 
                "\nListado de clientes: \n" +clientes;
        return contenido;
    }
    
    public void verificarNumeroReservasXcliente(){
        for(Cliente cliente: clientes){
            if(cliente.obtenerReservas().size() >= 5){
                cliente.asignarTipoCliente(ConstanteTipoCliente.TIPO_CLIENTE_VIP);
            }
        }
    }
}
