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
        
        /*Restaurante restauranteElCafetero = new Restaurante("El cafetero");

        ElementoConfort elementoTv = new Televisor("Televisor");
        ElementoConfort elementoMusica = new Musica("Musica");

        ItemReservable mesa1= new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        mesa1.agregarElementoDeConfort(elementoTv);

        //ItemReservable mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_LOUNGE);
        //mesa2.agregarElementoDeConfort(elementoMusica);

        //ItemReservable mesa3 = new Mesa("3",ConstantesTipoMesa.MESA_PAREJA);

        Cliente clientePersona = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_PERSONA,"1035868309","Sebastian");
        Cliente clienteEmpresa = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_EMPRESA,"1234","Empresa Soya");

        //Motivo motivo1 = new Motivo(ConstanteMotivo.MOTIVO_ANIVERSARIO,"Cualquier cosa jeje");
        //Motivo motivo2 = new Motivo(ConstanteMotivo.MOTIVO_BIENVENIDA,"Cualquier cosa jeje");

        //Reserva reserva1 = new Reserva("1", mesa1, motivo1,restauranteElCafetero);
        //Reserva reserva2 = new Reserva("2", mesa2, motivo2,restauranteElCafetero);
        //Reserva reserva3 = new Reserva("3", mesa3, motivo1,restauranteElCafetero);

        //clientePersona.realizarReserva(reserva1);
        //clientePersona.realizarReserva(reserva2);
        //restauranteElCafetero.agregarCliente(clientePersona);

        //clienteEmpresa.realizarReserva(reserva3);
        //restauranteElCafetero.agregarCliente(clienteEmpresa);

        //VisitorRestaurante cantidadtotalDeReReservas = new ReservasTotales();

        //restauranteElCafetero.accept(cantidadtotalDeReReservas);

        //System.out.println(restauranteElCafetero);*/

        execute();


    }

    private static void execute(){

        Restaurante restauranteElCafetero = new Restaurante("El cafetero");

        Cliente clientePersona = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_PERSONA,"1035868309","Sebastian");
        Cliente clienteEmpresa = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_EMPRESA,"1234","Empresa Soya");


        boolean pudoReservar = restauranteElCafetero.realizarReserva(clientePersona);
        if(pudoReservar){
            Plato plato = clientePersona.hacerPedido( restauranteElCafetero.obtenerMenu().get(0), ConstanteTipoPlato.PLATO_COMPLETO);
            System.out.println("Reserva exitosa");
            System.out.println("Valor del plato: " + plato.pago());
        }else {
            System.out.println("No hay reservas disponibles");
        }

        pudoReservar = restauranteElCafetero.realizarReserva(clienteEmpresa);

        if(pudoReservar){
            Plato plato = clienteEmpresa.hacerPedido(restauranteElCafetero.obtenerMenu().get(1),ConstanteTipoPlato.PLATO_MEDIO);
            System.out.println("Reserva exitosa");
            System.out.println("Valor del plato: " + plato.pago());
        }else {
            System.out.println("No hay reservas disponibles");
        }

        VisitorRestaurante visitorRestaurante = new NumeroReservasRealizadas();

        System.out.println(visitorRestaurante.visit(restauranteElCafetero));


    }
}
