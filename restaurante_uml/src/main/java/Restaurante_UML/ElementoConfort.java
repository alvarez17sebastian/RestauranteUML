/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;

/**
 *
 * @author sebastian.alvarez
 */
public  abstract class ElementoConfort {
    private String nombre;
    private String ambiente;
    
    public ElementoConfort(String nombre){
        this.nombre = nombre;
    }
    
    public void indicarAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        String content = "\nNombre Confort: " + nombre + "\nAmbiente: " + ambiente;
        return content;
    }
    
    
}
