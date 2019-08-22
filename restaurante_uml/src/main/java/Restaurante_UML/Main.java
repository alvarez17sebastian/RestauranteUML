/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;


import Restaurante_UML.constantes.ConstanteMotivo;
import Restaurante_UML.constantes.ConstantesTipoMesa;

/**
 *
 * @author sebastian.alvarez
 */
public class Main {
    public static void main(String[] args){
        
        Restaurante restaurante_ElCafetero = new Restaurante("El cafetero");
        
        ElementoConfort tv = new ElementoConfort("Tv");
        ElementoConfort equipo = new ElementoConfort("Musica");
        
        Mesa mesa1 = new Mesa("1",ConstantesTipoMesa.MESA_INDIVIDUAL);
        Mesa mesa2 = new Mesa("2",ConstantesTipoMesa.MESA_PAREJA);
        Mesa mesa3 = new Mesa("3",ConstantesTipoMesa.MESA_LOUNGE);
        Mesa mesa4 = new Mesa("4",ConstantesTipoMesa.MESA_GRUPAL);
        Mesa mesa5 = new Mesa("5",ConstantesTipoMesa.MESA_INDIVIDUAL);
        
        mesa3.agregarElementoDeConfort(tv);
        mesa3.agregarElementoDeConfort(equipo);
        
        
        Cliente sebastian = new Cliente("1035868309","Sebastian");
        Cliente eduardo = new Cliente("12345667890","Eduardo");
        
        
        Reserva reserva1 = new Reserva("1", mesa3, ConstanteMotivo.MOTIVO_ANIVERSARIO);
        reserva1.establecerAmbienteDeElemento();
       
        Reserva reserva2 = new Reserva("2", mesa2, ConstanteMotivo.MOTIVO_BIENVENIDA);
        reserva2.establecerAmbienteDeElemento();
        
        Reserva reserva3 = new Reserva("3", mesa2, ConstanteMotivo.MOTIVO_CUPLEANIOS);
        reserva3.establecerAmbienteDeElemento();
        
        Reserva reserva4 = new Reserva("4", mesa2, ConstanteMotivo.MOTIVO_ANIVERSARIO);
        reserva4.establecerAmbienteDeElemento();
        
        Reserva reserva5 = new Reserva("5", mesa2, ConstanteMotivo.MOTIVO_DESPEDIDA);
        reserva5.establecerAmbienteDeElemento();
        
        
       sebastian.realizarReserva(reserva1);
       restaurante_ElCafetero.agregarCliente(sebastian);
       
       eduardo.realizarReserva(reserva2);
       eduardo.realizarReserva(reserva3);
       eduardo.realizarReserva(reserva4);
       eduardo.realizarReserva(reserva5);
       eduardo.realizarReserva(reserva1);


       restaurante_ElCafetero.agregarCliente(eduardo);
       
       restaurante_ElCafetero.verificarNumeroReservasXcliente();
  
        System.out.println(restaurante_ElCafetero);
    }
}
