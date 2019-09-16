package Restaurante_UML.platos;

public class PlatoMedio extends Plato {

    @Override
    public double pago() {
        double totalPagar = this.precio * 0.8;
        return totalPagar;
    }
}
