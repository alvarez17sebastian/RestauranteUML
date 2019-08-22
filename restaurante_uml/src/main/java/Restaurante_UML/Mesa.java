/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante_UML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.alvarez
 */
public class Mesa {
    private String numeroMesa;
    private String tipoMesa;
    private List<ElementoConfort> elementosConfort = new ArrayList<>();
    
    public Mesa(String numeroMesa,String tipoMesa){
        this.numeroMesa = numeroMesa;
        this.tipoMesa = tipoMesa;
    }
    
    public String obtenerTipoMesa(){
        return this.tipoMesa;
    }
    
    public List<ElementoConfort> obtenerElementosDeConfort(){
        return this.elementosConfort;
    }
    
    public void agregarElementoDeConfort(ElementoConfort elementoConfort){
        elementosConfort.add(elementoConfort);
    }

    @Override
    public String toString() {
        String content = "Numero mesa: " + numeroMesa + "\nTipo mesa: " + tipoMesa + "\nElementos de confort: " + elementosConfort;
        return content;
    }
    
}
