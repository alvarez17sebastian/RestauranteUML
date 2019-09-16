package Restaurante_UML.ingredientes;

public abstract class Ingrediente {

    protected String nombre;
    protected double cantidad;
    protected String tipoIngrediente;

    public Ingrediente(String nombre, double cantidad, String tipoIngrediente) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoIngrediente = tipoIngrediente;
    }

    public String obtenerNombreIngrediente(){
        return this.nombre;
    }

    public double obtenerCantidad(){
        return this.cantidad;
    }

    public void asignarCantidad(double cantidad){
        this.cantidad = cantidad;
    }

}
