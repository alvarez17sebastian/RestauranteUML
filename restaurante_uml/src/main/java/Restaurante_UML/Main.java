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

        Restaurante restauranteElCafetero = new Restaurante("El cafetero");

        ElementoConfort tv = new ElementoConfort("Tv");
        ElementoConfort equipo = new ElementoConfort("Musica");

        Mesa mesa1 = new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        Mesa mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_PAREJA);

        Cliente sebastian = new Persona("1035868309","Sebastian");
        Cliente eduardo = new Persona("12345667890","Eduardo");

        Motivo motivo1 = new Motivo(ConstanteMotivo.MOTIVO_ANIVERSARIO,"Cualquier cosa jeje");
        Motivo motivo2 = new Motivo(ConstanteMotivo.MOTIVO_BIENVENIDA,"Cualquier cosa jeje");

        Reserva reserva1 = new Reserva("1", mesa2, motivo1,restauranteElCafetero);
        Reserva reserva2 = new Reserva("2", mesa1, motivo2,restauranteElCafetero);
        Reserva reserva3 = new Reserva("3", mesa1, motivo1,restauranteElCafetero);

        sebastian.realizarReserva(reserva1);
        sebastian.realizarReserva(reserva3);
        restauranteElCafetero.agregarCliente(sebastian);

        eduardo.realizarReserva(reserva2);
        restauranteElCafetero.agregarCliente(eduardo);

    }
}
