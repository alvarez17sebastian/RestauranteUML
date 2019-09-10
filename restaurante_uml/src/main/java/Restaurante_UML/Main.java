/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.constantes.ConstanteItemReservable;
import Restaurante_UML.constantes.ConstanteMotivo;
import Restaurante_UML.constantes.ConstanteTipoCliente;
import Restaurante_UML.constantes.ConstantesTipoMesa;
import com.sun.security.ntlm.Client;
import factoria.ClienteFactory;
import factoria.ItemReservableFactory;
import visitor.ReservasTotales;
import visitor.VisitorRestaurante;

import java.awt.*;
import java.util.Scanner;

/**
 *
 * @author sebastian.alvarez
 */
public class Main {
    public static void main(String[] args){


        Restaurante restauranteElCafetero = new Restaurante("El cafetero");

        //ElementoConfort tv = new ElementoConfort("Tv");
        //ElementoConfort equipo = new ElementoConfort("Musica");

        ElementoConfort elementoTv = new Televisor("Televisor");
        ElementoConfort elementoMusica = new Musica("Musica");

        ItemReservable mesa1= new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        mesa1.agregarElementoDeConfort(elementoTv);

        ItemReservable mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_LOUNGE);
        mesa2.agregarElementoDeConfort(elementoMusica);

        ItemReservable mesa3 = new Mesa("3",ConstantesTipoMesa.MESA_PAREJA);

        Cliente clientePersona = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_PERSONA,"1035868309","Sebastian");
        Cliente clienteEmpresa = ClienteFactory.obtenerCliente(ConstanteTipoCliente.KEY_CLIENTE_EMPRESA,"1234","Empresa Soya");

        Motivo motivo1 = new Motivo(ConstanteMotivo.MOTIVO_ANIVERSARIO,"Cualquier cosa jeje");
        Motivo motivo2 = new Motivo(ConstanteMotivo.MOTIVO_BIENVENIDA,"Cualquier cosa jeje");

        Reserva reserva1 = new Reserva("1", mesa1, motivo1,restauranteElCafetero);
        Reserva reserva2 = new Reserva("2", mesa2, motivo2,restauranteElCafetero);
        Reserva reserva3 = new Reserva("3", mesa3, motivo1,restauranteElCafetero);

        clientePersona.realizarReserva(reserva1);
        clientePersona.realizarReserva(reserva2);
        restauranteElCafetero.agregarCliente(clientePersona);

        clienteEmpresa.realizarReserva(reserva3);
        restauranteElCafetero.agregarCliente(clienteEmpresa);

        VisitorRestaurante cantidadtotalDeReReservas = new ReservasTotales();

        restauranteElCafetero.accept(cantidadtotalDeReReservas);

        System.out.println(restauranteElCafetero);

    }
}
