/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.constantes.ConstanteMotivo;
import Restaurante_UML.constantes.ConstantesTipoMesa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.alvarez
 */
public class Main {
    public static void main(String[] args){
        
        /*Restaurante restauranteElCafetero = new Restaurante("El cafetero");
        
        ElementoConfort tv = new ElementoConfort("Tv");
        ElementoConfort equipo = new ElementoConfort("Musica");
        
        Mesa mesa1 = new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        Mesa mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_PAREJA);
        Mesa mesa3 = new Mesa("3",ConstantesTipoMesa.MESA_LOUNGE);
        Mesa mesa4 = new Mesa("4",ConstantesTipoMesa.MESA_GRUPAL);
        Mesa mesa5 = new Mesa("5",ConstantesTipoMesa.MESA_INDIVIDUAL);


        mesa3.agregarElementoDeConfort(tv);
        mesa3.agregarElementoDeConfort(equipo);


        Cliente sebastian = new Persona("1035868309","Sebastian");
        Cliente eduardo = new Persona("12345667890","Eduardo");

        Cliente ceibaSoftware = new Empresa("123456","Ceiba Software House");
        Motivo motivo1 = new Motivo(ConstanteMotivo.MOTIVO_ANIVERSARIO,"Cualquier cosa jeje");
        Motivo motivo2 = new Motivo(ConstanteMotivo.MOTIVO_BIENVENIDA,"Cualquier cosa jeje");
        Motivo motivo3 = new Motivo(ConstanteMotivo.MOTIVO_DESPEDIDA,"Cualquier cosa jeje");
        
        Reserva reserva1 = new Reserva("1", mesa3, motivo1,restauranteElCafetero);
        Reserva reserva2 = new Reserva("2", mesa3, motivo2,restauranteElCafetero);
        Reserva reserva3 = new Reserva("3", mesa2, motivo3,restauranteElCafetero);
        Reserva reserva4 = new Reserva("4", mesa2, motivo1,restauranteElCafetero);
        Reserva reserva5 = new Reserva("5", mesa2, motivo2,restauranteElCafetero);

        
       sebastian.realizarReserva(reserva1);
       restauranteElCafetero.agregarCliente(sebastian);
       
       eduardo.realizarReserva(reserva2);
       eduardo.realizarReserva(reserva3);
       eduardo.realizarReserva(reserva4);
       eduardo.realizarReserva(reserva5);
       eduardo.realizarReserva(reserva1);
       restauranteElCafetero.agregarCliente(eduardo);

       ceibaSoftware.realizarReserva(reserva3);
       ceibaSoftware.realizarReserva(reserva2);
       ceibaSoftware.realizarReserva(reserva1);
       ceibaSoftware.realizarReserva(reserva5);
       ceibaSoftware.realizarReserva(reserva4);
        restauranteElCafetero.agregarCliente(ceibaSoftware);

        System.out.println(restauranteElCafetero);*/


        Restaurante restauranteElCafetero = new Restaurante("El cafetero");

        ElementoConfort tv = new ElementoConfort("Tv");
        ElementoConfort equipo = new ElementoConfort("Musica");

        Mesa mesa1 = new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        Mesa mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_PAREJA);

        Cocina cocina1 = new Cocina();
        Cocina cocina2 = new Cocina();


        Cliente sebastian = new Persona("1035868309","Sebastian");
        Cliente eduardo = new Persona("12345667890","Eduardo");

        Motivo motivo1 = new Motivo(ConstanteMotivo.MOTIVO_ANIVERSARIO,"Cualquier cosa jeje");
        Motivo motivo2 = new Motivo(ConstanteMotivo.MOTIVO_BIENVENIDA,"Cualquier cosa jeje");

        Reserva reserva1 = new Reserva("1", cocina1, motivo1,restauranteElCafetero);
        Reserva reserva2 = new Reserva("2", mesa1, motivo2,restauranteElCafetero);


        sebastian.realizarReserva(reserva1);
        restauranteElCafetero.agregarCliente(sebastian);

        eduardo.realizarReserva(reserva2);
        restauranteElCafetero.agregarCliente(eduardo);


    }
}
