package Restaurante_UML;

import Restaurante_UML.constantes.ConstanteTipoCliente;

public class Persona extends Cliente {

    public Persona(String cedula, String nombre) {
        super(cedula,nombre);
    }

    @Override
    public String obtenerTipoCliente() {
        return ConstanteTipoCliente.CLIENTE_PERSONA;
    }
}
