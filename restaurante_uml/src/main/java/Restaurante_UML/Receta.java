package Restaurante_UML;

import Restaurante_UML.ingredientes.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Receta{

    private String nombre;
    private double precio;

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Receta(){
        this.ingredientes = new ArrayList<>();
    }

    public Receta(String nombre,double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public List<Ingrediente> obtenerIngredientes(){
        return ingredientes;
    }
}
