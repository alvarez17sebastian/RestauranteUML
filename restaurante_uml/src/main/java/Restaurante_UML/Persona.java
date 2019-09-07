package Restaurante_UML;

import Restaurante_UML.constantes.ConstanteTipoCliente;

public class Persona extends Cliente {

    private int edad;
    private int genero;

    public Persona(String cedula, String nombre) {
        super(cedula,nombre);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    @Override
    public String obtenerTipoCliente() {
        return ConstanteTipoCliente.CLIENTE_PERSONA;
    }

}
