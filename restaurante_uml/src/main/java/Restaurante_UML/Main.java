/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.constantes.ConstanteTipoCliente;
import Restaurante_UML.constantes.ConstanteTipoPlato;
import Restaurante_UML.factoria.ClienteFactory;
import Restaurante_UML.platos.Plato;
import visitor.NumeroReservasRealizadas;
import visitor.VisitorRestaurante;

/**
 *
 * @author sebastian.alvarez
 */
public class Main {
    public static void main(String[] args){
        execute();
    }

    private static void execute(){

        Restaurante restauranteElCafetero = new Restaurante("El cafetero");

        Cliente clientePersona = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_PERSONA,"1035868309","Sebastian");
        Cliente clienteEmpresa = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_EMPRESA,"1234","Empresa Soya");


        boolean pudoReservar = restauranteElCafetero.realizarReserva(clientePersona);

        if(pudoReservar){
            System.out.println("Reserva exitosa");
            Plato plato = clientePersona.hacerPedido( restauranteElCafetero.obtenerMenu().get(0), ConstanteTipoPlato.PLATO_COMPLETO);
            if(plato != null){
                System.out.println("Valor del plato: " + plato.pago());
            }else{
                System.out.println("No hay ingredientes para su pedido");
            }

        }else {
            System.out.println("No hay reservas disponibles");
        }

        pudoReservar = restauranteElCafetero.realizarReserva(clienteEmpresa);

        if(pudoReservar){
            System.out.println("Reserva exitosa");
            Plato plato = clienteEmpresa.hacerPedido(restauranteElCafetero.obtenerMenu().get(1),ConstanteTipoPlato.PLATO_MEDIO);
            if(plato != null){
                System.out.println("Valor del plato: " + plato.pago());
            }else{
                System.out.println("No hay ingredientes para su pedido");
            }
        }else {
            System.out.println("No hay reservas disponibles");
        }

        VisitorRestaurante visitorRestaurante = new NumeroReservasRealizadas();

        System.out.println(visitorRestaurante.visit(restauranteElCafetero));


    }
}
