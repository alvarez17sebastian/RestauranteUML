package Restaurante_UML.platos;

public class PlatoCompleto extends Plato {

    @Override
    public double pago() {
        return precio;
    }
}
