/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.constantes.ConstanteItemReservable;
import Restaurante_UML.constantes.ConstanteMotivo;
import Restaurante_UML.constantes.ConstantesTipoMesa;
import factoria.ClienteFactory;
import factoria.ItemReservableFactory;
import visitor.ReservasTotales;
import visitor.VisitorRestaurante;

import java.util.Scanner;

/**
 *
 * @author sebastian.alvarez
 */
public class Main {
    public static void main(String[] args){

        /*
        Restaurante restauranteElCafetero = new Restaurante("El cafetero");

        //ElementoConfort tv = new ElementoConfort("Tv");
        //ElementoConfort equipo = new ElementoConfort("Musica");

        ElementoConfort elementoTv = new Televisor("Televisor");
        ElementoConfort elementoMusica = new Musica("Musica");

        //Mesa mesa1 = new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        //Mesa mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_PAREJA);
        //Mesa mesa3 = new Mesa("3",ConstantesTipoMesa.MESA_PAREJA);

        ItemReservable mesa1= new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        mesa1.agregarElementoDeConfort(elementoTv);

        ItemReservable mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_LOUNGE);
        mesa2.agregarElementoDeConfort(elementoMusica);

        ItemReservable mesa3 = new Mesa("3",ConstantesTipoMesa.MESA_PAREJA);


        Cliente sebastian = new Persona("1035868309","Sebastian");
        Cliente eduardo = new Persona("12345667890","Eduardo");

        Motivo motivo1 = new Motivo(ConstanteMotivo.MOTIVO_ANIVERSARIO,"Cualquier cosa jeje");
        Motivo motivo2 = new Motivo(ConstanteMotivo.MOTIVO_BIENVENIDA,"Cualquier cosa jeje");

        Reserva reserva1 = new Reserva("1", mesa1, motivo1,restauranteElCafetero);
        Reserva reserva2 = new Reserva("2", mesa2, motivo2,restauranteElCafetero);
        Reserva reserva3 = new Reserva("3", mesa3, motivo1,restauranteElCafetero);

        sebastian.realizarReserva(reserva1);
        sebastian.realizarReserva(reserva2);
        restauranteElCafetero.agregarCliente(sebastian);

        eduardo.realizarReserva(reserva3);
        restauranteElCafetero.agregarCliente(eduardo);

        VisitorRestaurante cantidadtotalDeReReservas = new ReservasTotales();

        restauranteElCafetero.accept(cantidadtotalDeReReservas);

        System.out.println(restauranteElCafetero);*/

        executeLogic();


    }

    private static void executeLogic(){

        ClienteFactory clienteFactory = new ClienteFactory();
        ItemReservableFactory itemReservableFactory = new ItemReservableFactory();

        Restaurante restaurante = new Restaurante("Buen Gusto");

        System.out.println("----------------------------------------");
        System.out.println("Bienvenido al restaurante: " + restaurante.obtenerNombre());
        System.out.println("----------------------------------------");
        System.out.println("1. Soy empresa \n2. Soy persona");
        System.out.print("Ingresa opción: ");

        Scanner scanner = new Scanner(System.in);

        int tipoClienteSeleccionado = scanner.nextInt();

        System.out.print("Ingrese identificación: ");
        String identificación = scanner.next();

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.next();

        Cliente cliente = clienteFactory.obtenerCliente(tipoClienteSeleccionado,identificación,nombre);

        System.out.println("Elemento a reservar: ");

        System.out.println("1. Mesa: ");
        int tipoElementoReservable = scanner.nextInt();

        ItemReservable itemReservable = itemReservableFactory.obtenerItemReservable(tipoElementoReservable);

        Motivo motivo1 = new Motivo(ConstanteMotivo.MOTIVO_ANIVERSARIO,"Cualquier cosa jeje");

        Reserva reserva1 = new Reserva("1", itemReservable, motivo1,restaurante);

        cliente.realizarReserva(reserva1);

        restaurante.agregarCliente(cliente);

        VisitorRestaurante cantidadtotalDeReReservas = new ReservasTotales();

        restaurante.accept(cantidadtotalDeReReservas);

        System.out.println(restaurante);

    }
}
