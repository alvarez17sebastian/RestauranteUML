package Restaurante_UML;

import Restaurante_UML.constantes.ConstanteTipoCliente;

import java.util.List;

public class CantidadDePersonasQueReservan extends Visitor {

    @Override
    protected String visit(Restaurante restaurante) {
        int numeroPersonas = 0;
        for(Cliente clienteActual: restaurante.obtenerClientes()){
            if(clienteActual.obtenerTipoCliente().equals(ConstanteTipoCliente.CLIENTE_PERSONA)){
                numeroPersonas++;
            }
        }
        return "Cantidad de personas que reservan: " + numeroPersonas;
    }
}
