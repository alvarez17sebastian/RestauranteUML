package Restaurante_UML.platos;

public abstract class Plato {

    protected String nombrePlato;
    protected double precio;

    public Plato(){

    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public  abstract double pago();
}